package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajor extends ajpf {
    private final Optional a;
    private final int b;
    private final ajpd c;
    private final String d;
    private final Instant e;
    private final Optional f;

    public ajor(Optional optional, int i, ajpd ajpdVar, String str, Instant instant, Optional optional2) {
        this.a = optional;
        this.b = i;
        this.c = ajpdVar;
        this.d = str;
        this.e = instant;
        this.f = optional2;
    }

    @Override // defpackage.ajpf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ajpf
    public final ajpd b() {
        return this.c;
    }

    @Override // defpackage.ajpf
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.ajpf
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.ajpf
    public final Optional e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpf) {
            ajpf ajpfVar = (ajpf) obj;
            if (this.a.equals(ajpfVar.e()) && this.b == ajpfVar.a() && this.c.equals(ajpfVar.b()) && this.d.equals(ajpfVar.f()) && this.e.equals(ajpfVar.c()) && this.f.equals(ajpfVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajpf
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Instant instant = this.e;
        ajpd ajpdVar = this.c;
        return "FileInformation{name=" + this.a.toString() + ", sizeBytes=" + this.b + ", contentType=" + ajpdVar.toString() + ", url=" + this.d + ", validUntil=" + instant.toString() + ", fileType=" + optional.toString() + "}";
    }
}
