package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabu {
    public final aabs a;
    public final yjy b;
    public final abbu c;
    public final aksr d;
    public final akbo e;
    public final int f;
    public final String g;
    public final boolean h;
    public final Context i;
    public final akbp j = new a();
    public final zbl k;
    public final zxy l;
    private final rft m;
    private final rfi n;

    public aabu(aabs aabsVar, rft rftVar, yjy yjyVar, zxy zxyVar, abbu abbuVar, rfi rfiVar, aksr aksrVar, zbl zblVar, akbo akboVar, Context context, aabv aabvVar) {
        this.a = aabsVar;
        this.m = rftVar;
        this.b = yjyVar;
        this.l = zxyVar;
        this.c = abbuVar;
        this.n = rfiVar;
        this.k = zblVar;
        this.e = akboVar;
        this.i = context;
        this.d = aksrVar;
        this.f = aabvVar.c;
        this.g = aabvVar.d;
        this.h = aabvVar.e;
    }

    public static aabs a(int i, String str, boolean z) {
        aozy createBuilder = aabv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aabv aabvVar = (aabv) apagVar;
        aabvVar.b |= 1;
        aabvVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aabv aabvVar2 = (aabv) apagVar2;
        aabvVar2.b |= 4;
        aabvVar2.e = z;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            aabv aabvVar3 = (aabv) createBuilder.b;
            aabvVar3.b |= 2;
            aabvVar3.d = str;
        }
        aabv aabvVar4 = (aabv) createBuilder.s();
        aabs aabsVar = new aabs();
        apxh.e(aabsVar);
        aklt.a(aabsVar, aabvVar4);
        return aabsVar;
    }

    public final void b(int i) {
        this.m.b().J();
        this.n.a(i).t();
    }

    public final void c(int i, boolean z) {
        if (z) {
            this.l.x(i).h(this.a.S(R.string.stop_asking_sim_number_pref_key), true);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Integer, Void> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            xzb.o("Bugle", "Failed to update MMS group phone number in SettingsStore for subId(%s). Throwable: %s", (Integer) obj, th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aabu.this.b(((Integer) obj).intValue());
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
