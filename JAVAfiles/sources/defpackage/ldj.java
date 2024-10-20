package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldj implements Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ agpj b;
    public final /* synthetic */ agpj c;
    public final /* synthetic */ ConversationIdType d;
    private final /* synthetic */ int e;

    public /* synthetic */ ldj(boolean z, agpj agpjVar, agpj agpjVar2, ConversationIdType conversationIdType, int i) {
        this.e = i;
        this.a = z;
        this.b = agpjVar;
        this.c = agpjVar2;
        this.d = conversationIdType;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        if (this.e != 0) {
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.e != 0) {
            lcy lcyVar = (lcy) obj;
            boolean z = this.a;
            lcyVar.b(new lcg(z, 0), new lch(z, this.b, 0), new ldi(z, this.c, this.d, 1));
            return lcyVar;
        }
        lcy lcyVar2 = (lcy) obj;
        boolean z2 = this.a;
        lcyVar2.b(new lcg(z2, 3), new lch(z2, this.b, 2), new ldi(z2, this.c, this.d, 0));
        return lcyVar2;
    }

    public final /* synthetic */ Function compose(Function function) {
        if (this.e != 0) {
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
