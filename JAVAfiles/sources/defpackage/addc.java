package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class addc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessagingResult apply(adqv adqvVar) {
        ajps d = MessagingResult.d();
        b(adqvVar, d);
        d.b(adqvVar.g);
        d.d(adqvVar.h);
        return d.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public void b(adqv adqvVar, ajps ajpsVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
