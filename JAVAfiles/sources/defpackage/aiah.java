package defpackage;

import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiah implements Parcelable {
    public final aiag a;
    public final aiam b;
    public final Instant c;

    public aiah() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiah) {
            aiah aiahVar = (aiah) obj;
            if (this.a.equals(aiahVar.a) && this.b.equals(aiahVar.b) && this.c.equals(aiahVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        aiam aiamVar = this.b;
        return "FuelPrice{type=" + this.a.toString() + ", price=" + aiamVar.toString() + ", updateTime=" + instant.toString() + "}";
    }

    public aiah(aiag aiagVar, aiam aiamVar, Instant instant) {
        if (aiagVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = aiagVar;
        if (aiamVar != null) {
            this.b = aiamVar;
            if (instant != null) {
                this.c = instant;
                return;
            }
            throw new NullPointerException("Null updateTime");
        }
        throw new NullPointerException("Null price");
    }
}
