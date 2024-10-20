package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldi implements Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ldi(zkv zkvVar, String str, boolean z, int i) {
        this.d = i;
        this.c = zkvVar;
        this.b = str;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object obj2;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zkv zkvVar = (zkv) this.c;
                    return zkvVar.a(((vrn) ((xyt) zkvVar.u.b()).a()).e(adom.n((adiv) obj).a), (String) this.b, this.a);
                }
                sef sefVar = (sef) obj;
                boolean z = this.a;
                Object obj3 = this.b;
                if (z && (obj2 = this.c) != null) {
                    obj3 = ((qei) obj2).d;
                }
                sefVar.c((String) obj3);
                return sefVar;
            }
            lcy lcyVar = (lcy) obj;
            lcyVar.W(lga.t(this.a));
            lcyVar.W(this.b);
            lcyVar.i(((ConversationIdType) this.c).a);
            return lcyVar;
        }
        lcy lcyVar2 = (lcy) obj;
        lcyVar2.W(lga.t(this.a));
        lcyVar2.W(this.b);
        lcyVar2.i(((ConversationIdType) this.c).a);
        return lcyVar2;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ ldi(boolean z, agpj agpjVar, ConversationIdType conversationIdType, int i) {
        this.d = i;
        this.a = z;
        this.b = agpjVar;
        this.c = conversationIdType;
    }

    public /* synthetic */ ldi(boolean z, qei qeiVar, String str, int i) {
        this.d = i;
        this.a = z;
        this.c = qeiVar;
        this.b = str;
    }
}
