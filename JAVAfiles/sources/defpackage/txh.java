package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class txh implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final txk apply(DecryptResult decryptResult) {
        aozy createBuilder = txk.a.createBuilder();
        if (decryptResult.getStatus() != null) {
            txm txmVar = (txm) txl.a.fu(decryptResult.getStatus());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((txk) createBuilder.b).c = txmVar.a();
        }
        if (decryptResult.getDecryptedMessage() != null) {
            b(decryptResult, createBuilder);
        }
        c(decryptResult, createBuilder);
        return (txk) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(DecryptResult decryptResult, aozy aozyVar);

    public abstract void c(DecryptResult decryptResult, aozy aozyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
