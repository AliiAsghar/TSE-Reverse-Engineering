package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivk implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ivk(int i) {
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
        String substring;
        String format;
        int i = 3;
        boolean z = false;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ila ilaVar = (ila) obj;
                alvi alviVar = ixd.a;
                ilaVar.getClass();
                if (ilaVar.e() != null && ilaVar.e().E().j()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((jbv) obj).a();
            case 2:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar2 = ixd.a;
                if (composeMessageView != null && composeMessageView.E().j()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                alvi alviVar3 = ixd.a;
                return ((ila) obj).e().E().r();
            case 4:
                alvi alviVar4 = ixd.a;
                return ((ComposeMessageView) obj).E().r();
            case 5:
                return new gtq((ila) obj, 20);
            case 6:
                alvi alviVar5 = ixd.a;
                return new ivl(((ComposeMessageView) obj).E(), i);
            case 7:
                alvi alviVar6 = ixd.a;
                return ((ila) obj).e().findViewById(R.id.compose_message_text);
            case 8:
                alvi alviVar7 = ixd.a;
                return ((ComposeMessageView) obj).findViewById(R.id.compose_message_text);
            case 9:
                alvi alviVar8 = ixd.a;
                return Boolean.valueOf(((ila) obj).e().E().U());
            case 10:
                alvi alviVar9 = ixd.a;
                return Boolean.valueOf(((ComposeMessageView) obj).E().U());
            case 11:
                return new ivl((ila) obj, i2);
            case 12:
                alvi alviVar10 = ixd.a;
                return new gtq(((ComposeMessageView) obj).E(), 19);
            case 13:
                return ((ila) obj).e().E().r();
            case 14:
                e = ((msh) obj).e();
                return e;
            case 15:
                smu smuVar = (smu) obj;
                return new smv[]{smuVar.c, smuVar.O};
            case 16:
                return ((lzc) obj).a();
            case 17:
                snh snhVar = (snh) obj;
                utz utzVar = kkn.f;
                snhVar.p();
                return snhVar;
            case 18:
                return ((MessageCoreData) obj).z();
            case 19:
                suy suyVar = (suy) obj;
                int i3 = kkx.k;
                suyVar.U(new agoi("message_labels.label", 2, Integer.valueOf(SuperSortLabel.PERSONAL.i)));
                return suyVar;
            default:
                agmh agmhVar = (agmh) obj;
                String d = agmhVar.d();
                if (d == null) {
                    substring = null;
                } else {
                    substring = d.substring(d.indexOf(".") + 1);
                }
                Locale locale = Locale.ROOT;
                if (!agmhVar.f() && !agmhVar.a.d) {
                    format = String.format(Locale.ROOT, "('RED: ' || length(%s))", substring);
                } else {
                    format = String.format(Locale.ROOT, "('RED: ' || random() || ':' || length(%s))", substring);
                }
                return String.valueOf(substring).concat(String.valueOf(String.format(locale, " = CASE (%s) WHEN (%s ISNULL) THEN NULL ELSE %s END", substring, substring, format)));
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
