package defpackage;

import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiab implements Parcelable {
    public final aiae a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Instant f;

    public aiab() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiab) {
            aiab aiabVar = (aiab) obj;
            if (this.a.equals(aiabVar.a) && this.b.equals(aiabVar.b) && this.c.equals(aiabVar.c) && ((num = this.d) != null ? num.equals(aiabVar.d) : aiabVar.d == null) && ((num2 = this.e) != null ? num2.equals(aiabVar.e) : aiabVar.e == null)) {
                Instant instant = this.f;
                Instant instant2 = aiabVar.f;
                if (instant != null ? instant.equals(instant2) : instant2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        Integer num = this.d;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        Integer num2 = this.e;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Instant instant = this.f;
        if (instant != null) {
            i = instant.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        Instant instant = this.f;
        return "ConnectorAggregation{type=" + this.a.toString() + ", maxChargeRateKw=" + this.b + ", count=" + this.c + ", availableCount=" + this.d + ", outOfServiceCount=" + this.e + ", availabilityLastUpdateTime=" + String.valueOf(instant) + "}";
    }

    public aiab(aiae aiaeVar, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (aiaeVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = aiaeVar;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = instant;
    }
}
