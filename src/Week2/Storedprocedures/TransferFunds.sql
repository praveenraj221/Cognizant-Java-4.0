CREATE OR REPLACE PROCEDURE TransferFunds (
    p_FromAccID IN NUMBER,
    p_ToAccID IN NUMBER,
    p_Amount IN NUMBER
) IS
    v_FromBalance NUMBER;
BEGIN
    -- Get balance of source account
    SELECT Balance INTO v_FromBalance
    FROM BankAccounts
    WHERE AccountID = p_FromAccID
    FOR UPDATE;

    -- Check sufficient balance
    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
    END IF;

    -- Deduct from source
    UPDATE BankAccounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccID;

    -- Add to destination
    UPDATE BankAccounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccID;

    COMMIT;
END;

