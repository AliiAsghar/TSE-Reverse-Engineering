package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akvd implements gfa {
    public final /* synthetic */ akvf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gfa c;

    public /* synthetic */ akvd(akvf akvfVar, String str, gfa gfaVar) {
        this.a = akvfVar;
        this.b = str;
        this.c = gfaVar;
    }

    @Override // defpackage.gfa
    public final boolean a(Preference preference, Object obj) {
        ahmn ahmnVar = this.a.a;
        gfa gfaVar = this.c;
        aksa n = ahmnVar.n("OnPreferenceChangeListener", this.b);
        try {
            boolean a = gfaVar.a(preference, obj);
            n.close();
            return a;
        } catch (Throwable th) {
            try {
                n.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
