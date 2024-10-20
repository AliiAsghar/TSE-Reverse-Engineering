package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzz extends alar {
    public final Optional a;
    public final Optional b;
    public final List c;
    private final Optional d;
    private final Optional e;

    public akzz() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzz) {
            akzz akzzVar = (akzz) obj;
            if (this.d.equals(akzzVar.d) && this.e.equals(akzzVar.e) && this.a.equals(akzzVar.a) && this.b.equals(akzzVar.b) && this.c.equals(akzzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        List list = this.c;
        Optional optional = this.b;
        Optional optional2 = this.a;
        Optional optional3 = this.e;
        return "CalendarEvent{id=" + String.valueOf(this.d) + ", name=" + String.valueOf(optional3) + ", startDate=" + String.valueOf(optional2) + ", endDate=" + String.valueOf(optional) + ", attendeeList=" + String.valueOf(list) + "}";
    }

    public akzz(Optional optional, Optional optional2, Optional optional3, Optional optional4, List list) {
        this.d = optional;
        this.e = optional2;
        this.a = optional3;
        this.b = optional4;
        this.c = list;
    }
}
