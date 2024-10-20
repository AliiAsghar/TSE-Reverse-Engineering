package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiez implements aifc {
    private final aozb a;
    private final int b;

    public aiez() {
        throw null;
    }

    @Override // defpackage.aifc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aifc
    public final InputStream b() {
        return this.a.m();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiez) {
            aiez aiezVar = (aiez) obj;
            if (this.a.equals(aiezVar.a) && this.b == aiezVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ByteStringContent{content=" + this.a.toString() + ", contentLength=" + this.b + "}";
    }

    public aiez(aozb aozbVar, int i) {
        if (aozbVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = aozbVar;
        this.b = i;
    }
}
