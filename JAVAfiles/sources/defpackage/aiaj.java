package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiaj implements Parcelable, Comparable {
    public final int a;
    public final int b;
    public final int c;

    public aiaj() {
        throw null;
    }

    public static aiaj b(int i, int i2, int i3) {
        int i4;
        ahzi ahziVar = new ahzi(i, i2, i3);
        int i5 = ahziVar.b;
        alst d = alst.d(1, 12);
        Integer valueOf = Integer.valueOf(i5);
        albo.L(d.a(valueOf), "Month must not be out of range of 1 to 12, but was: %s.", i5);
        int i6 = ahziVar.c;
        alst d2 = alst.d(1, 31);
        Integer valueOf2 = Integer.valueOf(i6);
        albo.L(d2.a(valueOf2), "Day must not be out of range of 1 to 31, but was: %s.", i6);
        if (Arrays.asList(4, 6, 9, 11).contains(valueOf)) {
            albo.O(alst.d(1, 30).a(valueOf2), "%s is not a valid day for month %s.", i6, i5);
        }
        if (i5 == 2) {
            int i7 = ahziVar.a;
            if (i7 % 4 == 0) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            albo.R(alst.d(1, Integer.valueOf(i4)).a(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, Integer.valueOf(i7));
        }
        return ahziVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aiaj aiajVar) {
        aiajVar.getClass();
        if (this != aiajVar) {
            int i = this.a;
            int i2 = aiajVar.a;
            if (i == i2) {
                int i3 = this.b;
                int i4 = aiajVar.b;
                if (i3 != i4) {
                    return i3 - i4;
                }
                return this.c - aiajVar.c;
            }
            return i - i2;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiaj) {
            aiaj aiajVar = (aiaj) obj;
            if (this.a == aiajVar.a && this.b == aiajVar.b && this.c == aiajVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(this.a), String.format(Locale.getDefault(), "%02d", Integer.valueOf(this.b)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(this.c)));
    }

    public aiaj(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
