package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akve implements gfb {
    public final /* synthetic */ akvf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gfb c;

    public /* synthetic */ akve(akvf akvfVar, String str, gfb gfbVar) {
        this.a = akvfVar;
        this.b = str;
        this.c = gfbVar;
    }

    @Override // defpackage.gfb
    public final boolean a(Preference preference) {
        ahmn ahmnVar = this.a.a;
        gfb gfbVar = this.c;
        aksa n = ahmnVar.n("OnPreferenceClickListener", this.b);
        try {
            boolean a = gfbVar.a(preference);
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
