package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibd implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final ahyw g;
    public final String h;
    public final String i;

    public aibd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibd) {
            aibd aibdVar = (aibd) obj;
            String str = this.a;
            if (str != null ? str.equals(aibdVar.a) : aibdVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(aibdVar.b) : aibdVar.b == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(aibdVar.c) : aibdVar.c == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(aibdVar.d) : aibdVar.d == null) {
                            String str5 = this.e;
                            if (str5 != null ? str5.equals(aibdVar.e) : aibdVar.e == null) {
                                if (this.f.equals(aibdVar.f) && this.g.equals(aibdVar.g) && this.h.equals(aibdVar.h)) {
                                    String str6 = this.i;
                                    String str7 = aibdVar.i;
                                    if (str6 != null ? str6.equals(str7) : str7 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode6 = (((((((i4 ^ hashCode5) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str6 = this.i;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 ^ i;
    }

    public final String toString() {
        return "Review{relativePublishTimeDescription=" + this.a + ", text=" + this.b + ", textLanguageCode=" + this.c + ", originalText=" + this.d + ", originalTextLanguageCode=" + this.e + ", rating=" + this.f + ", authorAttribution=" + this.g.toString() + ", attribution=" + this.h + ", publishTime=" + this.i + "}";
    }

    public aibd(String str, String str2, String str3, String str4, String str5, Double d, ahyw ahywVar, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        if (ahywVar == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.g = ahywVar;
        if (str6 != null) {
            this.h = str6;
            this.i = str7;
            return;
        }
        throw new NullPointerException("Null attribution");
    }
}
