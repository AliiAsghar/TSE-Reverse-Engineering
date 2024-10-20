package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbv implements agar {
    private static final alvi f = alvi.m("com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore");
    public final aegu a;
    public final arwe b;
    public final afke c;
    public volatile agbw d;
    public final aiwu e;
    private final Activity g;
    private arxm h;
    private int i;
    private agaq j;

    public agbv(Activity activity, aegu aeguVar, aiwu aiwuVar, arwe arweVar, afke afkeVar) {
        activity.getClass();
        aeguVar.getClass();
        aiwuVar.getClass();
        arweVar.getClass();
        afkeVar.getClass();
        this.g = activity;
        this.a = aeguVar;
        this.e = aiwuVar;
        this.b = arweVar;
        this.c = afkeVar;
        this.j = agaq.d;
    }

    private final void a(agaq agaqVar, int i) {
        Integer valueOf;
        if (agaqVar == agaq.a && i >= 0) {
            if (afzv.e(this.g)) {
                agbw agbwVar = this.d;
                if (agbwVar != null) {
                    valueOf = Integer.valueOf(agbwVar.c);
                }
                valueOf = null;
            } else {
                agbw agbwVar2 = this.d;
                if (agbwVar2 != null) {
                    valueOf = Integer.valueOf(agbwVar2.d);
                }
                valueOf = null;
            }
            if (valueOf == null || i != valueOf.intValue()) {
                this.d = null;
                boolean e = afzv.e(this.g);
                ((alvg) f.g().h("com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore", "saveHeightToDataStore", 89, "KeyboardDataPersistenceProtoDataStore.kt")).x("Saving keyboard height of %d (is portrait: %s)", i, e);
                arxm arxmVar = this.h;
                if (arxmVar != null) {
                    arxmVar.v(null);
                }
                this.h = arrn.J(this.b, null, null, new agbu(this, e, i, null), 3);
            }
        }
    }

    @Override // defpackage.agar
    public final void l(int i) {
        this.i = i;
        a(this.j, i);
    }

    @Override // defpackage.agar
    public final void m(agaq agaqVar) {
        agaqVar.getClass();
        this.j = agaqVar;
        a(agaqVar, this.i);
    }
}
