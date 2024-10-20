package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiao implements Parcelable {
    public final aian a;
    public final List b;
    public final List c;
    public final List d;

    public aiao() {
        throw null;
    }

    public static aibn a() {
        aibn aibnVar = new aibn();
        aibnVar.h(new ArrayList());
        aibnVar.i(new ArrayList());
        aibnVar.j(new ArrayList());
        return aibnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiao) {
            aiao aiaoVar = (aiao) obj;
            aian aianVar = this.a;
            if (aianVar != null ? aianVar.equals(aiaoVar.a) : aiaoVar.a == null) {
                if (this.b.equals(aiaoVar.b) && this.c.equals(aiaoVar.c) && this.d.equals(aiaoVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aian aianVar = this.a;
        if (aianVar == null) {
            hashCode = 0;
        } else {
            hashCode = aianVar.hashCode();
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        List list3 = this.b;
        return "OpeningHours{hoursType=" + String.valueOf(this.a) + ", periods=" + list3.toString() + ", specialDays=" + list2.toString() + ", weekdayText=" + list.toString() + "}";
    }

    public aiao(aian aianVar, List list, List list2, List list3) {
        this.a = aianVar;
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.b = list;
        if (list2 != null) {
            this.c = list2;
            if (list3 != null) {
                this.d = list3;
                return;
            }
            throw new NullPointerException("Null weekdayText");
        }
        throw new NullPointerException("Null specialDays");
    }
}
