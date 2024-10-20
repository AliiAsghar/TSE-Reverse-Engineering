package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyx {
    public static final aiyx a;
    public static final AtomicBoolean b;
    public final aiyy c;
    public aizc d;
    public String e;
    public alog f;
    public long g;
    public final aegu h;
    public String i;
    public long j;
    public final String k;
    public yfc l;

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations");
        a = new aiyx();
        b = new AtomicBoolean(false);
    }

    private aiyx() {
        aegx aegxVar = new aegx();
        this.h = aegxVar;
        this.k = "com.google.android.libraries.surveys.internal.view.SurveyActivity";
        this.c = aiyy.a;
        ahnz.a = new asqc(this, null);
        this.g = 0L;
        this.j = aegxVar.f().toEpochMilli();
    }

    public static void a() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    public static void b() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final void c(int i, aizc aizcVar) {
        String str;
        int i2;
        yfc yfcVar = this.l;
        if (yfcVar != null) {
            aiyt a2 = aizcVar.a();
            if (((Boolean) ((utz) yfd.b.get()).e()).booleanValue()) {
                maq maqVar = (maq) ((yfd) yfcVar.d.a).c.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                aozy createBuilder = amlb.a.createBuilder();
                aozy createBuilder2 = amkw.a.createBuilder();
                switch (i - 1) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    default:
                        i2 = 10;
                        break;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amkw amkwVar = (amkw) apagVar;
                amkwVar.d = i2 - 1;
                amkwVar.b |= 2;
                String str2 = a2.a;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                String ag = albo.ag(str2);
                amkw amkwVar2 = (amkw) createBuilder2.b;
                amkwVar2.b |= 1;
                amkwVar2.c = ag;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amlb amlbVar = (amlb) createBuilder.b;
                amkw amkwVar3 = (amkw) createBuilder2.s();
                amkwVar3.getClass();
                amlbVar.g = amkwVar3;
                amlbVar.b |= 16;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amlb amlbVar2 = (amlb) createBuilder.s();
                amlbVar2.getClass();
                amfrVar.aE = amlbVar2;
                amfrVar.e |= 262144;
                amfp amfpVar = amfp.BUGLE_HATS_NEXT_CLIENT_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amfrVar2.i = amfpVar.dg;
                amfrVar2.b |= 1;
                maqVar.j(amfqVar);
            }
            yfcVar.b.setBackground(yfcVar.c);
            switch (i) {
                case 1:
                    str = "CLIENT_ACTIVITY_WAS_DESTROYED";
                    break;
                case 2:
                    str = "CLIENT_ACTIVITY_WAS_FINISHING";
                    break;
                case 3:
                    str = "CLIENT_ACTIVITY_WAS_NULL";
                    break;
                case 4:
                    str = "INVALID_COMPLETION_STYLE";
                    break;
                case 5:
                    str = "INVALID_PROMPT_STYLE";
                    break;
                case 6:
                    str = "INVALID_SURVEY_DATA_TYPE";
                    break;
                case 7:
                    str = "INVALID_SURVEY_PAYLOAD";
                    break;
                case 8:
                    str = "SURVEY_ALREADY_RUNNING";
                    break;
                default:
                    str = "SURVEY_EXPIRED";
                    break;
            }
            yfd.a.m(String.format("Failed to present survey (metadata: %s, error: %s.)", 0, str));
        }
    }

    public final void d(apog apogVar, asgf asgfVar, Context context) {
        String str;
        if (TextUtils.isEmpty(this.e)) {
            str = null;
        } else {
            str = this.e;
        }
        String str2 = str;
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a2 = aizq.a();
        aozy createBuilder = apoj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apoj apojVar = (apoj) createBuilder.b;
        apogVar.getClass();
        apojVar.c = apogVar;
        apojVar.b = 4;
        a2.c((apoj) createBuilder.s(), asgfVar.b(), asgfVar.a(), context, str2);
    }

    public final aizi e(akkw akkwVar, String str) {
        aizi v = aiyw.a.d.v((Context) akkwVar.d, (String) akkwVar.c, "", str);
        v.e = (aoij) akkwVar.a;
        return v;
    }
}
