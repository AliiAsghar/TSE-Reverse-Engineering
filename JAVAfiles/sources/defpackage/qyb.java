package defpackage;

import android.util.SparseArray;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyb implements xzh {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache");
    private final vl b = new vl();
    private final SparseArray c = new SparseArray();
    private boolean d = true;

    public final synchronized String a(String str) {
        return (String) this.b.get(str);
    }

    public final synchronized void b() {
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void c(String str, String str2) {
        if (this.d) {
            this.b.put(str, str2);
        }
    }

    public final synchronized void d(ParticipantsTable.BindData bindData) {
        String M = bindData.M();
        if (ryg.l(bindData)) {
            e(bindData.p(), M);
            return;
        }
        String O = bindData.O();
        if (O != null) {
            c(O, M);
            return;
        }
        alvw i = a.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/ParticipantIdCache", "putParticipant", 70, "ParticipantIdCache.java")).q("Problem caching participant ID: normalizationDestination was null");
    }

    public final synchronized void e(int i, String str) {
        if (this.d) {
            this.c.put(i, str);
        }
    }

    public final synchronized void f(tap tapVar) {
        if (ryg.m(tapVar)) {
            this.c.remove(tapVar.d);
        }
        this.b.remove(tapVar.f);
    }

    public final synchronized void g() {
        this.d = true;
    }

    public final synchronized void h() {
        b();
        this.d = false;
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        b();
    }
}
