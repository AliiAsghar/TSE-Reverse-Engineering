package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknt {
    public final String a;
    public final apbt b;
    public final aknr c;
    public final alog d;
    public final algw e;
    public final algw f;
    public final Executor g;
    private final algw h;

    public aknt() {
        throw null;
    }

    public static akns a() {
        akns aknsVar = new akns(null);
        aknsVar.d = (byte) 1;
        aknsVar.b = new aknr(1, 2);
        return aknsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknt) {
            aknt akntVar = (aknt) obj;
            if (this.a.equals(akntVar.a) && this.h.equals(akntVar.h) && this.b.equals(akntVar.b) && this.c.equals(akntVar.c) && alzz.at(this.d, akntVar.d) && this.e.equals(akntVar.e) && this.f.equals(akntVar.f)) {
                Executor executor = this.g;
                Executor executor2 = akntVar.g;
                if (executor != null ? executor.equals(executor2) : executor2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Executor executor = this.g;
        if (executor == null) {
            hashCode = 0;
        } else {
            hashCode = executor.hashCode();
        }
        return ((((hashCode2 * 1000003) ^ 2040732332) * 1000003) ^ hashCode) * 1000003;
    }

    public final String toString() {
        Executor executor = this.g;
        algw algwVar = this.f;
        algw algwVar2 = this.e;
        alog alogVar = this.d;
        aknr aknrVar = this.c;
        apbt apbtVar = this.b;
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=" + String.valueOf(this.h) + ", schema=" + String.valueOf(apbtVar) + ", storage=" + String.valueOf(aknrVar) + ", migrations=" + String.valueOf(alogVar) + ", handler=" + String.valueOf(algwVar2) + ", logger=" + String.valueOf(algwVar) + ", ioExecutor=" + String.valueOf(executor) + ", lamsConfig=null}";
    }

    public aknt(String str, algw algwVar, apbt apbtVar, aknr aknrVar, alog alogVar, algw algwVar2, algw algwVar3, Executor executor) {
        this.a = str;
        this.h = algwVar;
        this.b = apbtVar;
        this.c = aknrVar;
        this.d = alogVar;
        this.e = algwVar2;
        this.f = algwVar3;
        this.g = executor;
    }
}
