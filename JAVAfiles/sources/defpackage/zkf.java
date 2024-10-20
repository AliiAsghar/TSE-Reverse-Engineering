package defpackage;

import android.text.InputFilter;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zkf implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ zkf(int i) {
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
        String o;
        switch (this.a) {
            case 0:
                return ((msh) obj).i();
            case 1:
                return ((msh) obj).m();
            case 2:
                return ((wjd) obj).b;
            case 3:
                return ((MessagePartCoreData) obj).K();
            case 4:
                return ((lug) obj).a();
            case 5:
                return Boolean.valueOf(((msh) obj).v());
            case 6:
                return false;
            case 7:
                xze xzeVar = zri.a;
                return (InputFilter.LengthFilter) ((InputFilter) obj);
            case 8:
                return Integer.valueOf(((InputFilter.LengthFilter) obj).getMax());
            case 9:
                return ((lyv) obj).a();
            case 10:
                return Integer.valueOf(((ykb) obj).a());
            case 11:
                return ((smu) obj).q;
            case 12:
                return null;
            case 13:
                return ((lug) obj).a();
            case 14:
                uuf uufVar = ConversationMessageView.a;
                return null;
            case 15:
                return Collection.EL.stream(((iiq) obj).a());
            case 16:
                return Collection.EL.stream(((iiq) obj).a());
            case 17:
                String U = ((MessagePartCoreData) obj).U();
                if (U == null) {
                    return "";
                }
                return U;
            case 18:
                o = ((msh) obj).o(((Boolean) new mss(0).get()).booleanValue());
                return o;
            case 19:
                snh snhVar = (snh) obj;
                snhVar.v();
                return snhVar;
            default:
                xze xzeVar2 = aalt.c;
                return ((rrl) obj).c;
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
