package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mqm implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mqm(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object e;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        switch (this.a) {
            case 0:
                return a.aZ(obj);
            case 1:
                ConversationId conversationId = (ConversationId) obj;
                d.s(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            case 2:
                return a.aZ(obj);
            case 3:
                return ((msh) obj).i();
            case 4:
                return ((msh) obj).m();
            case 5:
                alwo alwoVar = msb.a;
                return ((msh) obj).c();
            case 6:
                alwo alwoVar2 = msb.a;
                String k = ((msh) obj).k();
                k.getClass();
                return k;
            case 7:
                alwo alwoVar3 = msb.a;
                return ((msh) obj).n();
            case 8:
                e = ((msh) obj).e();
                return e;
            case 9:
                alwo alwoVar4 = msb.a;
                return ((msh) obj).F();
            case 10:
                return ((msh) obj).a();
            case 11:
                return ((msh) obj).b();
            case 12:
                return ((msh) obj).f();
            case 13:
                obj2 = ((qei) obj).d;
                return obj2;
            case 14:
                String str = (String) obj;
                if (str != null) {
                    z = str.isEmpty();
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return ((yjt) obj).toString();
            case 16:
                return ((yjt) obj).toString();
            case 17:
                return new yjt(Integer.parseInt((String) obj));
            case 18:
                obj3 = ((sxo) obj).a;
                return obj3;
            case 19:
                obj4 = ((sxo) obj).a;
                return obj4;
            default:
                return ((tbh) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
