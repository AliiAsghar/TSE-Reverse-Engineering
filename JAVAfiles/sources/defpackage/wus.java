package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wus {
    public final wuk a;
    public final Optional b;
    public final apbt c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    public wus() {
        throw null;
    }

    public static aiwl a() {
        aiwl aiwlVar = new aiwl(null, null);
        aiwlVar.g(false);
        return aiwlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wus) {
            wus wusVar = (wus) obj;
            if (this.a.equals(wusVar.a) && this.b.equals(wusVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        apbt apbtVar = this.c;
        Optional optional3 = this.b;
        return "SettingsStoreConfig{key=" + String.valueOf(this.a) + ", subKey=" + String.valueOf(optional3) + ", schema=" + String.valueOf(apbtVar) + ", migration=" + String.valueOf(optional2) + ", invalidProtocolBufferException=" + String.valueOf(optional) + ", enableCache=" + this.f + "}";
    }

    public wus(wuk wukVar, Optional optional, apbt apbtVar, Optional optional2, Optional optional3, boolean z) {
        this.a = wukVar;
        this.b = optional;
        this.c = apbtVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }
}
