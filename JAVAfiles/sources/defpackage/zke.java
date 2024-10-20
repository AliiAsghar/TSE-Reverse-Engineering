package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zke {
    public static final uuf a = uuh.i(uuh.b, "enable_per_subscription_settings_migration_to_settings_store", false);
    public final Context b;
    public final ykw c;
    public final wul d;
    final String e;
    public final ansy f;
    private final ahiy g;

    public zke(znj znjVar, Context context, ansy ansyVar, zxy zxyVar, yjy yjyVar, ahiy ahiyVar, int i) {
        this.b = context;
        this.f = ansyVar;
        this.c = zxyVar.x(i);
        this.g = ahiyVar;
        int a2 = yjyVar.h(i).a();
        aiwl a3 = wus.a();
        a3.i(wuk.PER_SUBSCRIPTION_SETTINGS);
        a3.l(String.valueOf(a2));
        a3.k(zkb.a);
        a3.j(new zkd(this));
        a3.h(new zhh(3));
        this.d = znjVar.ab(a3.f());
        this.e = String.valueOf(String.valueOf(wuk.PER_SUBSCRIPTION_SETTINGS)).concat(String.valueOf(String.valueOf(a2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zkb a() {
        try {
            return (zkb) this.d.l();
        } catch (apba e) {
            throw new IllegalStateException("InvalidProtocolBufferException while getting per subscription settings data", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul b() {
        akul j = this.d.j(new zms(1));
        l(j);
        return j;
    }

    public final akul c(Optional optional) {
        String str = (String) optional.map(new yug(20)).orElse(null);
        if (str == null) {
            return b();
        }
        akul j = this.d.j(new zet(str, 3));
        l(j);
        return j;
    }

    @Deprecated
    public final akul d(String str) {
        akul j = this.d.j(new zet(str, 4));
        l(j);
        return j;
    }

    public final Optional e() {
        zkb a2 = a();
        if ((a2.b & 1) != 0) {
            return Optional.of(Boolean.valueOf(a2.c));
        }
        return Optional.empty();
    }

    public final Optional f() {
        zkb a2 = a();
        if ((a2.b & 2) != 0) {
            return Optional.of(Boolean.valueOf(a2.d));
        }
        return Optional.empty();
    }

    public final Optional g() {
        zkb a2 = a();
        if ((a2.b & 64) != 0) {
            return Optional.of(Boolean.valueOf(a2.i));
        }
        return Optional.empty();
    }

    public final Optional h() {
        zkb a2 = a();
        if ((a2.b & 8) != 0) {
            return Optional.of(Boolean.valueOf(a2.f));
        }
        return Optional.empty();
    }

    public final Optional i() {
        zkb a2 = a();
        if ((a2.b & 16) != 0) {
            return Optional.of(Boolean.valueOf(a2.g));
        }
        return Optional.empty();
    }

    public final Optional j() {
        zkb a2 = a();
        if ((a2.b & 32) != 0) {
            return Optional.of(a2.h);
        }
        return Optional.empty();
    }

    public final Optional k() {
        zkb a2 = a();
        if ((a2.b & 4) != 0) {
            return Optional.of(Boolean.valueOf(a2.e));
        }
        return Optional.empty();
    }

    public final void l(akul akulVar) {
        this.g.q(akulVar, this.e);
    }
}
