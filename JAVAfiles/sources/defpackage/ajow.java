package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajow extends ajpo {
    private final String a;
    private final ajpu b;
    private final ajpn c;
    private final Optional d;
    private final Optional e;
    private final alog f;

    public ajow(String str, ajpu ajpuVar, ajpn ajpnVar, Optional optional, Optional optional2, alog alogVar) {
        this.a = str;
        this.b = ajpuVar;
        this.c = ajpnVar;
        this.d = optional;
        this.e = optional2;
        this.f = alogVar;
    }

    @Override // defpackage.ajpo
    public final ajpn a() {
        return this.c;
    }

    @Override // defpackage.ajpo
    public final ajpu b() {
        return this.b;
    }

    @Override // defpackage.ajpo
    public final alog c() {
        return this.f;
    }

    @Override // defpackage.ajpo
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ajpo
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpo) {
            ajpo ajpoVar = (ajpo) obj;
            if (this.a.equals(ajpoVar.f()) && this.b.equals(ajpoVar.b()) && this.c.equals(ajpoVar.a()) && this.d.equals(ajpoVar.e()) && this.e.equals(ajpoVar.d()) && alzz.at(this.f, ajpoVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajpo
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
