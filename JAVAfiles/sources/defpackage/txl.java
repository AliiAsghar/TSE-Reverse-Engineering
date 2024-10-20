package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class txl extends txh {
    public static final algf a = new txi();
    public static final algf b = new txj();

    @Override // defpackage.txh
    public final void b(DecryptResult decryptResult, aozy aozyVar) {
        decryptResult.getClass();
        aozyVar.getClass();
        if (decryptResult.getDecryptedMessage() == null) {
            return;
        }
        aozb w = aozb.w(decryptResult.getDecryptedMessage());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        txk txkVar = (txk) aozyVar.b;
        txk txkVar2 = txk.a;
        txkVar.b |= 1;
        txkVar.d = w;
    }

    @Override // defpackage.txh
    public final void c(DecryptResult decryptResult, aozy aozyVar) {
        txo txoVar;
        decryptResult.getClass();
        aozyVar.getClass();
        if (decryptResult.getReceipt() == null) {
            return;
        }
        ReceiptInfo receipt = decryptResult.getReceipt();
        aozy createBuilder = txp.a.createBuilder();
        if (receipt.getMessageId() != null) {
            String messageId = receipt.getMessageId();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            txp txpVar = (txp) createBuilder.b;
            messageId.getClass();
            txpVar.c = messageId;
        }
        long messageTimestampUsec = receipt.getMessageTimestampUsec();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((txp) createBuilder.b).d = messageTimestampUsec;
        receipt.getClass();
        createBuilder.getClass();
        ReceiptError error = receipt.getError();
        if (error != null && (txoVar = (txo) new txj().fu(error)) != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((txp) createBuilder.b).e = txoVar.a();
        }
        if (receipt.getSignature() != null) {
            receipt.getClass();
            createBuilder.getClass();
            if (receipt.getSignature() != null) {
                aozb w = aozb.w(receipt.getSignature());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                txp txpVar2 = (txp) createBuilder.b;
                txpVar2.b |= 1;
                txpVar2.f = w;
            }
        }
        txp txpVar3 = (txp) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        txk txkVar = (txk) aozyVar.b;
        txk txkVar2 = txk.a;
        txpVar3.getClass();
        txkVar.e = txpVar3;
        txkVar.b |= 2;
    }
}
