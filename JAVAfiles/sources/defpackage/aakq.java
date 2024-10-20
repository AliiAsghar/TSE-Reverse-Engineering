package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakq implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ aakq(int i) {
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
        switch (this.a) {
            case 0:
                tad tadVar = (tad) obj;
                tadVar.getClass();
                String d = aajv.d(tan.c.a);
                tadVar.ao(3, "participant_id");
                String d2 = aajv.d(tan.c.i);
                tadVar.ao(8, "normalized_destination");
                String d3 = aajv.d(tan.c.j);
                tadVar.ao(9, "send_destination");
                String d4 = aajv.d(tan.c.k);
                tadVar.ao(10, "display_destination");
                String d5 = aajv.d(tan.c.p);
                tadVar.ao(15, "full_name");
                Map m = aqjn.m(new armo(d, tadVar.d), new armo(d2, tadVar.i), new armo(d3, tadVar.j), new armo(d4, tadVar.k), new armo(d5, tadVar.p));
                tadVar.ao(0, "_id");
                String str = tadVar.a;
                str.getClass();
                long parseLong = Long.parseLong(str);
                tadVar.ao(1, "operation_datetime");
                Instant instant = tadVar.b;
                instant.getClass();
                aajd aajdVar = aajd.a;
                tadVar.ao(2, "operation_type");
                aajd b = aajv.b(tadVar.c);
                tadVar.ao(43, "last_modified_by_key");
                rxg rxgVar = tadVar.R;
                rxgVar.getClass();
                return new aajc("participants_audit_log", parseLong, instant, b, rxgVar, m);
            case 1:
                xze xzeVar = aalt.c;
                return Long.toString(((skl) obj).h());
            case 2:
                skl sklVar = (skl) obj;
                sklVar.getClass();
                String c = aajv.c((skn) sks.c.c);
                sklVar.ao(3, "conversation_participants_id");
                String c2 = aajv.c((skn) sks.c.j);
                sklVar.ao(4, "conversation_id");
                Map m2 = aqjn.m(new armo(c, sklVar.d), new armo(c2, sklVar.e), new armo(aajv.c((skn) sks.c.e), Long.valueOf(sklVar.h())));
                sklVar.ao(0, "_id");
                String str2 = sklVar.a;
                str2.getClass();
                long parseLong2 = Long.parseLong(str2);
                sklVar.ao(1, "operation_datetime");
                Instant instant2 = sklVar.b;
                instant2.getClass();
                aajd aajdVar2 = aajd.a;
                sklVar.ao(2, "operation_type");
                aajd b2 = aajv.b(sklVar.c);
                sklVar.ao(8, "last_modified_by_key");
                rxg rxgVar2 = sklVar.i;
                rxgVar2.getClass();
                return new aajc("conversation_participants_audit_log", parseLong2, instant2, b2, rxgVar2, m2);
            case 3:
                return ((aajc) obj).a;
            case 4:
                return ((aajc) obj).toString();
            case 5:
                snh snhVar = (snh) obj;
                xze xzeVar2 = aalt.c;
                snhVar.x();
                snhVar.e(0);
                return snhVar;
            case 6:
                xze xzeVar3 = aalt.c;
                return ((smu) obj).a;
            case 7:
                xze xzeVar4 = aalt.c;
                return albo.ag(((msh) obj).F().a);
            case 8:
                return ((adit) obj).a;
            case 9:
                xze xzeVar5 = aalt.c;
                return Long.valueOf(((skl) obj).h());
            case 10:
                xze xzeVar6 = aalt.c;
                return ((sxo) obj).a;
            case 11:
                stc stcVar = (stc) obj;
                xze xzeVar7 = aalt.c;
                String join = TextUtils.join("\n", alog.t("Conversation Id: ".concat(String.valueOf(String.valueOf(stcVar.k()))), "Message Id: ".concat(String.valueOf(String.valueOf(stcVar.l()))), "Type: " + stcVar.h()));
                aqby m3 = stcVar.m();
                if (m3 != null && m3.b == 2) {
                    String valueOf = String.valueOf(((aqce) m3.c).b);
                    return TextUtils.join("\n", alog.u(join, "OTP code: ".concat(valueOf), "Start index: " + m3.g, "End index: " + m3.h));
                }
                return join;
            case 12:
                xze xzeVar8 = aalt.c;
                return ((sxo) obj).C;
            case 13:
                xze xzeVar9 = aalt.c;
                return ((sxo) obj).C;
            case 14:
                xze xzeVar10 = aalt.c;
                return ((xtg) obj).g;
            case 15:
                return Integer.valueOf(((MessagesTable.BindData) obj).k());
            case 16:
                xze xzeVar11 = aalt.c;
                return Integer.valueOf(Integer.parseInt(((MessagesTable.BindData) obj).an("count")));
            case 17:
                return Long.valueOf(Long.parseLong((String) obj));
            case 18:
                syc sycVar = (syc) obj;
                int i = aali.c;
                sycVar.M(210);
                return sycVar;
            case 19:
                return ((rrl) obj).c;
            default:
                return ((ParticipantsTable.BindData) obj).M();
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
