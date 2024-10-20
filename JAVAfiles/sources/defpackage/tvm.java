package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvm {
    private static final xze a = xze.g("BugleEtouffee", "ReceiptInfos");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReceiptInfo a(aozb aozbVar) {
        return b((apwn) apag.parseFrom(apwn.a, aozbVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReceiptInfo b(apwn apwnVar) {
        ReceiptError receiptError;
        String str = apwnVar.c;
        apwm b = apwm.b(apwnVar.d);
        if (b == null) {
            b = apwm.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            xyo e = a.e();
                            e.H("Unknown ReceiptInfo.Error value");
                            e.x("error", b.f);
                            e.q();
                            receiptError = ReceiptError.UNKNOWN;
                        }
                    } else {
                        receiptError = ReceiptError.OTK_NOT_TARGETED_TO_ME;
                    }
                } else {
                    receiptError = ReceiptError.FAILED_TO_DECRYPT;
                }
            } else {
                receiptError = ReceiptError.SUCCESS;
            }
            return new ReceiptInfo(str, 0L, receiptError, apwnVar.e.H());
        }
        receiptError = ReceiptError.UNKNOWN;
        return new ReceiptInfo(str, 0L, receiptError, apwnVar.e.H());
    }
}
