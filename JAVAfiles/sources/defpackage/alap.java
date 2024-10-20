package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alap extends alar {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final List g;
    private final Optional h;
    private final Optional i;

    public alap() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.h;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alap) {
            alap alapVar = (alap) obj;
            if (this.h.equals(alapVar.h) && this.i.equals(alapVar.i) && this.a.equals(alapVar.a) && this.b.equals(alapVar.b) && this.c.equals(alapVar.c) && this.d.equals(alapVar.d) && this.e.equals(alapVar.e) && this.f.equals(alapVar.f) && this.g.equals(alapVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.h.hashCode() ^ 1000003) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        List list = this.g;
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        Optional optional6 = this.a;
        Optional optional7 = this.i;
        return "Schedule{id=" + String.valueOf(this.h) + ", name=" + String.valueOf(optional7) + ", startDate=" + String.valueOf(optional6) + ", startTime=" + String.valueOf(optional5) + ", endDate=" + String.valueOf(optional4) + ", endTime=" + String.valueOf(optional3) + ", scheduleTimezone=" + String.valueOf(optional2) + ", repeatFrequency=" + String.valueOf(optional) + ", byDayList=" + String.valueOf(list) + "}";
    }

    public alap(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, List list) {
        this.h = optional;
        this.i = optional2;
        this.a = optional3;
        this.b = optional4;
        this.c = optional5;
        this.d = optional6;
        this.e = optional7;
        this.f = optional8;
        this.g = list;
    }
}
