package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnc extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final qnc t = new qnc(20);
    public static final qnc s = new qnc(19);
    public static final qnc r = new qnc(18);
    public static final qnc q = new qnc(17);
    public static final qnc p = new qnc(16);
    public static final qnc o = new qnc(15);
    public static final qnc n = new qnc(14);
    public static final qnc m = new qnc(13);
    public static final qnc l = new qnc(12);
    public static final qnc k = new qnc(11);
    public static final qnc j = new qnc(10);
    public static final qnc i = new qnc(9);
    public static final qnc h = new qnc(8);
    public static final qnc g = new qnc(7);
    public static final qnc f = new qnc(6);
    public static final qnc e = new qnc(5);
    public static final qnc d = new qnc(3);
    public static final qnc c = new qnc(2);
    public static final qnc b = new qnc(1);
    public static final qnc a = new qnc(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnc(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        switch (this.u) {
            case 0:
                return qno.d(obj);
            case 1:
                return qno.d(obj);
            case 2:
                ((String) obj).getClass();
                return new ahlp(null, null, null, null);
            case 3:
                qwm qwmVar = (qwm) obj;
                qwmVar.getClass();
                return Integer.valueOf(qwmVar.e());
            case 4:
                vae vaeVar = (vae) obj;
                vaeVar.getClass();
                vaeVar.c();
                return arnb.a;
            case 5:
                return ((msh) obj).m();
            case 6:
                return ((msh) obj).m();
            case 7:
                msh mshVar = (msh) obj;
                mshVar.getClass();
                if (mshVar.m() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                Object e2 = msw.d.e();
                e2.getClass();
                return ((msh) obj).o(((Boolean) e2).booleanValue());
            case 9:
                sxy sxyVar = (sxy) obj;
                sxyVar.getClass();
                taz e3 = ParticipantsTable.e();
                e3.s();
                agog b2 = agoh.b(e3.b(), ParticipantsTable.c.a, MessagesTable.c.c);
                b2.f = "bugle_participant";
                return (sxy) sxyVar.j(b2);
            case 10:
                sxy sxyVar2 = (sxy) obj;
                sxyVar2.getClass();
                tjp tjpVar = new tjp(tjr.a);
                tjpVar.c(new rqa(19));
                agog b3 = agoh.b(tjpVar.b(), (agmh) tjr.c.c, MessagesTable.c.c);
                b3.f = "bugle_suffix_scratch";
                return (sxy) sxyVar2.j(b3);
            case 11:
                sxy sxyVar3 = (sxy) obj;
                sxyVar3.getClass();
                tbs d2 = PartsTable.d();
                d2.s();
                agog b4 = agoh.b(d2.b(), PartsTable.d.b, MessagesTable.c.a);
                b4.f = "bugle_parts";
                return (sxy) sxyVar3.j(b4);
            case 12:
                return ((rxf) obj).a();
            case 13:
                return ((msh) obj).e();
            case 14:
                return ((msh) obj).e();
            case 15:
                ((MessageId) obj).getClass();
                return new asgm();
            case 16:
                ((MessageId) obj).getClass();
                return new asgm();
            case 17:
                ((MessageId) obj).getClass();
                return new asgm();
            case 18:
                upi upiVar = (upi) obj;
                upiVar.getClass();
                upiVar.a();
                return arnb.a;
            case 19:
                uxo uxoVar = (uxo) obj;
                uxoVar.getClass();
                aozy builder = uxoVar.toBuilder();
                uxk uxkVar = uxoVar.c;
                if (uxkVar == null) {
                    uxkVar = uxk.a;
                }
                aozy builder2 = uxkVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apag apagVar = builder2.b;
                uxk uxkVar2 = (uxk) apagVar;
                uxkVar2.b &= -2;
                uxkVar2.c = 0;
                if (!apagVar.isMutable()) {
                    builder2.u();
                }
                ((uxk) builder2.b).d = false;
                uxk uxkVar3 = (uxk) builder2.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                uxo uxoVar2 = (uxo) builder.b;
                uxkVar3.getClass();
                uxoVar2.c = uxkVar3;
                uxoVar2.b |= 1;
                apag s2 = builder.s();
                s2.getClass();
                return (uxo) s2;
            default:
                uxo uxoVar3 = (uxo) obj;
                uxoVar3.getClass();
                aozy builder3 = uxoVar3.toBuilder();
                uxk uxkVar4 = uxoVar3.c;
                if (uxkVar4 == null) {
                    uxkVar4 = uxk.a;
                }
                aozy builder4 = uxkVar4.toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                ((uxk) builder4.b).d = true;
                uxk uxkVar5 = (uxk) builder4.s();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                uxo uxoVar4 = (uxo) builder3.b;
                uxkVar5.getClass();
                uxoVar4.c = uxkVar5;
                uxoVar4.b |= 1;
                apag s3 = builder3.s();
                s3.getClass();
                return (uxo) s3;
        }
    }
}
