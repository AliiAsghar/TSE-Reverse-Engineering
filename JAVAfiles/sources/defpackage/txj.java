package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class txj extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        txo txoVar = (txo) obj;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int ordinal = txoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new IllegalArgumentException("unknown enum value: ".concat(txoVar.toString()));
                        }
                    } else {
                        return ReceiptError.OTK_NOT_TARGETED_TO_ME;
                    }
                } else {
                    return ReceiptError.FAILED_TO_DECRYPT;
                }
            } else {
                return ReceiptError.SUCCESS;
            }
        }
        return ReceiptError.UNKNOWN;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ReceiptError receiptError = (ReceiptError) obj;
        int ordinal = receiptError.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return txo.OTK_NOT_TARGETED_TO_ME;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(receiptError.toString()));
                }
                return txo.FAILED_TO_DECRYPT;
            }
            return txo.SUCCESS;
        }
        return txo.UNKNOWN_RECEIPT_ERROR;
    }
}
