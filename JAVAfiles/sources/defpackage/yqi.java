package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqi implements yqh {
    public static final alhr a = uuh.w("moirai_v1_catch_initialization_errors");
    public static final alwo b = alwo.o("BugleDataModel");
    public final armf c;
    private final armf d;
    private final anen e;
    private final anen f;

    public yqi(armf armfVar, armf armfVar2, anen anenVar, anen anenVar2) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = anenVar;
        this.f = anenVar2;
    }

    @Override // defpackage.yqh
    public final akul a(String str) {
        akul i;
        if (!TextUtils.isEmpty(str)) {
            aaji aajiVar = new aaji(str, 13);
            alok alokVar = new alok();
            aajiVar.a(alokVar);
            aech aechVar = new aech(alokVar.b());
            akrh e = aktp.e("BugleMoiraiApiImpl#callHadesClassify");
            try {
                if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
                    i = ((yqn) this.d.b()).a().i(new xfv(this, aechVar, 16), this.f).e(IllegalStateException.class, new yeb(19), this.e);
                    e.b(i);
                } else {
                    i = ((yqn) this.d.b()).a().i(new xfv(this, aechVar, 17), andi.a);
                    e.b(i);
                }
                e.close();
                return i;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "classifyDestination", 120, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#classify: empty phone number");
        return aktp.ag(new aect((String) null, (aecg) null, 7));
    }
}
