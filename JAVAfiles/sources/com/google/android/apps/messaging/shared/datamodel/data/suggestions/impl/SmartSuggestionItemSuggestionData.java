package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.a;
import defpackage.aqbc;
import defpackage.aqbg;
import defpackage.aqbk;
import defpackage.aqbl;
import defpackage.aqbq;
import defpackage.aqbt;
import defpackage.aqcp;
import defpackage.aqcs;
import defpackage.aqcy;
import defpackage.aqcz;
import defpackage.aqda;
import defpackage.aqdd;
import defpackage.arrj;
import defpackage.rha;
import defpackage.rvc;
import defpackage.ryj;
import defpackage.ryk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SmartSuggestionItemSuggestionData implements SmartSuggestionData {
    public static final Parcelable.Creator<SmartSuggestionItemSuggestionData> CREATOR = new rha(14);
    public final String a;
    public ryk b;
    public aqcz c;

    public SmartSuggestionItemSuggestionData(aqcz aqczVar, String str, ryk rykVar) {
        this.a = str;
        this.b = rykVar;
        this.c = aqczVar;
    }

    @Override // defpackage.mqz
    public final String a() {
        aqcz aqczVar = this.c;
        int i = aqczVar.c;
        if (i == 15) {
            String str = ((aqcp) aqczVar.d).b;
            str.getClass();
            return str;
        }
        if (i == 2) {
            String str2 = ((aqda) aqczVar.d).c;
            str2.getClass();
            return str2;
        }
        return "";
    }

    @Override // defpackage.mqz
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mqz
    public final String c() {
        aqcy aqcyVar = this.c.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        String str = aqcyVar.o;
        str.getClass();
        return str;
    }

    @Override // defpackage.mqz
    public final String d() {
        aqda aqdaVar;
        aqcz aqczVar = this.c;
        aqczVar.getClass();
        if (aqczVar.c == 2) {
            aqdaVar = (aqda) aqczVar.d;
        } else {
            aqdaVar = null;
        }
        if (aqdaVar != null && (aqdaVar.b & 1) != 0) {
            String str = ((aqda) aqczVar.d).d;
            str.getClass();
            return str;
        }
        return a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.mqz
    public final boolean e() {
        if (!ryj.c(this) && ryj.a(ryj.b(this)) != aqbc.CATEGORY_EMOTIVE) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final long f() {
        aqcs aqcsVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 17) {
            aqcsVar = (aqcs) aqczVar.d;
        } else {
            aqcsVar = aqcs.a;
        }
        return aqcsVar.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final aqcz g() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String h() {
        aqbl aqblVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 11) {
            aqblVar = (aqbl) aqczVar.d;
        } else {
            aqblVar = aqbl.a;
        }
        String str = aqblVar.b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String i() {
        aqbg aqbgVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 7) {
            aqbgVar = (aqbg) aqczVar.d;
        } else {
            aqbgVar = aqbg.a;
        }
        String str = aqbgVar.b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String j() {
        aqbk aqbkVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 6) {
            aqbkVar = (aqbk) aqczVar.d;
        } else {
            aqbkVar = aqbk.a;
        }
        String str = aqbkVar.c;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String k() {
        aqbk aqbkVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 6) {
            aqbkVar = (aqbk) aqczVar.d;
        } else {
            aqbkVar = aqbk.a;
        }
        String str = aqbkVar.d;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String l() {
        aqbq aqbqVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 13) {
            aqbqVar = (aqbq) aqczVar.d;
        } else {
            aqbqVar = aqbq.a;
        }
        String str = aqbqVar.b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String m() {
        aqbt aqbtVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 5) {
            aqbtVar = (aqbt) aqczVar.d;
        } else {
            aqbtVar = aqbt.a;
        }
        String str = aqbtVar.b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String n() {
        aqbq aqbqVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 13) {
            aqbqVar = (aqbq) aqczVar.d;
        } else {
            aqbqVar = aqbq.a;
        }
        String str = aqbqVar.c;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String o() {
        aqcy aqcyVar = this.c.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        aqdd aqddVar = aqcyVar.i;
        if (aqddVar == null) {
            aqddVar = aqdd.a;
        }
        String str = aqddVar.b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final boolean p() {
        if (this.c.c == 12) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final int q() {
        aqcy aqcyVar = this.c.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        int aL = a.aL(aqcyVar.f);
        if (aL == 0) {
            return 1;
        }
        return aL;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType r() {
        aqcy aqcyVar = this.c.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        return rvc.b(aqcyVar.l);
    }

    public final aqbc s() {
        aqcy aqcyVar = this.c.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        aqbc b = aqbc.b(aqcyVar.k);
        if (b == null) {
            b = aqbc.UNRECOGNIZED;
        }
        b.getClass();
        return b;
    }

    public final String t() {
        aqbg aqbgVar;
        aqcz aqczVar = this.c;
        if (aqczVar.c == 7) {
            aqbgVar = (aqbg) aqczVar.d;
        } else {
            aqbgVar = aqbg.a;
        }
        String str = aqbgVar.c;
        str.getClass();
        return str;
    }

    public final String toString() {
        aqcy aqcyVar;
        Locale locale = Locale.US;
        aqcy aqcyVar2 = this.c.e;
        if (aqcyVar2 == null) {
            aqcyVar2 = aqcy.b;
        }
        Integer valueOf = Integer.valueOf(aqcyVar2.k);
        aqcy aqcyVar3 = this.c.e;
        if (aqcyVar3 == null) {
            aqcyVar = aqcy.b;
        } else {
            aqcyVar = aqcyVar3;
        }
        String str = aqcyVar.l;
        if (aqcyVar3 == null) {
            aqcyVar3 = aqcy.b;
        }
        String format = String.format(locale, "{type=%d, targetMessageId=%s, suggestionId=%s}", Arrays.copyOf(new Object[]{valueOf, str, aqcyVar3.j}, 3));
        format.getClass();
        return format;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, this.c), 0);
        parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, this.b), 0);
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(aqcz aqczVar, String str, ryk rykVar, arrj arrjVar) {
        this(aqczVar, str, rykVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SmartSuggestionItemSuggestionData(android.os.Parcel r3, defpackage.arrj r4) {
        /*
            r2 = this;
            java.lang.Class<aqcz> r4 = defpackage.aqcz.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r3.readParcelable(r4)
            r4.getClass()
            apdj r4 = (defpackage.apdj) r4
            aqcz r0 = defpackage.aqcz.a
            aozs r1 = defpackage.aozs.a()
            apbt r4 = r4.a(r0, r1)
            r4.getClass()
            aqcz r4 = (defpackage.aqcz) r4
            java.lang.Class<ryk> r0 = defpackage.ryk.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            r3.getClass()
            apdj r3 = (defpackage.apdj) r3
            ryk r0 = defpackage.ryk.a
            aozs r1 = defpackage.aozs.a()
            apbt r3 = r3.a(r0, r1)
            r3.getClass()
            ryk r3 = (defpackage.ryk) r3
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData.<init>(android.os.Parcel, arrj):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SmartSuggestionItemSuggestionData(defpackage.aqcz r3) {
        /*
            r2 = this;
            r3.getClass()
            ryk r0 = defpackage.ryk.a
            r0.getClass()
            java.lang.String r1 = ""
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData.<init>(aqcz):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartSuggestionItemSuggestionData(aqcz aqczVar, ryk rykVar) {
        this(aqczVar, "", rykVar);
        aqczVar.getClass();
        rykVar.getClass();
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(aqcz aqczVar, ryk rykVar, int i, arrj arrjVar) {
        this(aqczVar, (i & 2) != 0 ? ryk.a : rykVar);
    }
}
