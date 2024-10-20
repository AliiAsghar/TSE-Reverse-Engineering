package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyk {
    public final ContentValues a;
    public final alog b;
    public final alog c;
    public final String d;
    public final aiyj e;

    public aiyk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiyk) {
            aiyk aiykVar = (aiyk) obj;
            if (this.a.equals(aiykVar.a) && alzz.at(this.b, aiykVar.b) && alzz.at(this.c, aiykVar.c) && ((str = this.d) != null ? str.equals(aiykVar.d) : aiykVar.d == null)) {
                aiyj aiyjVar = this.e;
                aiyj aiyjVar2 = aiykVar.e;
                if (aiyjVar != null ? aiyjVar.equals(aiyjVar2) : aiyjVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        aiyj aiyjVar = this.e;
        if (aiyjVar != null) {
            i = aiyjVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        aiyj aiyjVar = this.e;
        alog alogVar = this.c;
        alog alogVar2 = this.b;
        return "Mms{values=" + String.valueOf(this.a) + ", addresses=" + String.valueOf(alogVar2) + ", attachments=" + String.valueOf(alogVar) + ", smil=" + this.d + ", body=" + String.valueOf(aiyjVar) + "}";
    }

    public aiyk(ContentValues contentValues, alog alogVar, alog alogVar2, String str, aiyj aiyjVar) {
        this.a = contentValues;
        this.b = alogVar;
        this.c = alogVar2;
        this.d = str;
        this.e = aiyjVar;
    }
}
