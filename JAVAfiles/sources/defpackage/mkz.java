package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkz {
    public final MessageIdType a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final boolean g;
    public final amlg h;
    public final int i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final boolean m;
    public final Optional n;
    public final int o;

    public mkz() {
        throw null;
    }

    public static mkw a() {
        mkw mkwVar = new mkw(null);
        mkwVar.d(false);
        mkwVar.b(true);
        mkwVar.g(amlg.UNDEFINED);
        mkwVar.g = 1;
        mkwVar.h(8);
        return mkwVar;
    }

    public static mkw b(final sya syaVar, Optional optional) {
        final mkw a = a();
        final int i = 1;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i2 = i;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing terminal error status");
        final int i2 = 0;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i22 = i2;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing raw telephony status");
        final int i3 = 2;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i22 = i3;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing resultCode");
        final int i4 = 3;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i22 = i4;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing errorCode");
        final int i5 = 4;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i22 = i5;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing notified");
        final int i6 = 5;
        c(new mky() { // from class: mkv
            @Override // defpackage.mky
            public final void a() {
                int i22 = i6;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 != 4) {
                                    ContentValues contentValues = syaVar.a;
                                    tqu[] values = tqu.values();
                                    int intValue = contentValues.getAsInteger("xms_transport").intValue();
                                    if (intValue < values.length) {
                                        a.c = Optional.of(values[intValue]);
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                a.d(syaVar.a.getAsBoolean("seen").booleanValue());
                                return;
                            }
                            Integer asInteger = syaVar.a.getAsInteger("sms_error_code");
                            asInteger.intValue();
                            a.b = Optional.of(asInteger);
                            return;
                        }
                        Integer asInteger2 = syaVar.a.getAsInteger("result_code");
                        asInteger2.intValue();
                        a.a = Optional.of(asInteger2);
                        return;
                    }
                    a.h(syaVar.b());
                    return;
                }
                a.e(syaVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing xmsTransport");
        return a;
    }

    private static void c(mky mkyVar, Optional optional, String str) {
        try {
            mkyVar.a();
        } catch (RuntimeException e) {
            optional.ifPresent(new ksn(str, e, 7, null));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mkz) {
            mkz mkzVar = (mkz) obj;
            if (this.a.equals(mkzVar.a) && this.b.equals(mkzVar.b) && this.c.equals(mkzVar.c) && this.d.equals(mkzVar.d) && this.e.equals(mkzVar.e) && this.f.equals(mkzVar.f) && this.g == mkzVar.g && this.h.equals(mkzVar.h)) {
                int i = this.o;
                int i2 = mkzVar.o;
                if (i != 0) {
                    if (i2 == 1 && this.i == mkzVar.i && this.j.equals(mkzVar.j) && this.k.equals(mkzVar.k) && this.l.equals(mkzVar.l) && this.m == mkzVar.m && this.n.equals(mkzVar.n)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        boolean z = this.g;
        int hashCode2 = this.h.hashCode();
        int i2 = 1237;
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        a.bm(this.o);
        int hashCode3 = (((((((((((((hashCode * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ 1) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
        Optional optional = this.n;
        boolean z2 = this.m;
        int hashCode4 = optional.hashCode();
        if (true == z2) {
            i2 = 1231;
        }
        return (((hashCode3 * 1000003) ^ i2) * 1000003) ^ hashCode4;
    }

    public final String toString() {
        String str;
        amlg amlgVar = this.h;
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(optional5);
        String valueOf3 = String.valueOf(optional4);
        String valueOf4 = String.valueOf(optional3);
        String valueOf5 = String.valueOf(optional2);
        String valueOf6 = String.valueOf(optional);
        String valueOf7 = String.valueOf(amlgVar);
        if (this.o != 0) {
            str = akec.aF(1);
        } else {
            str = "null";
        }
        Optional optional6 = this.j;
        Optional optional7 = this.k;
        Optional optional8 = this.l;
        Optional optional9 = this.n;
        return "MessageFailureContext{messageId=" + valueOf + ", rcsMessageId=" + valueOf2 + ", rawTelephonyStatus=" + valueOf3 + ", resultCode=" + valueOf4 + ", errorCode=" + valueOf5 + ", xmsTransport=" + valueOf6 + ", notified=" + this.g + ", reason=" + valueOf7 + ", canFallback=" + str + ", terminalStatus=" + this.i + ", timestamp=" + String.valueOf(optional6) + ", hidden=" + String.valueOf(optional7) + ", sendCount=" + String.valueOf(optional8) + ", logEnabled=" + this.m + ", logContent=" + String.valueOf(optional9) + "}";
    }

    public mkz(MessageIdType messageIdType, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, amlg amlgVar, int i, Optional optional6, Optional optional7, Optional optional8, boolean z2, Optional optional9) {
        this.a = messageIdType;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
        this.g = z;
        this.h = amlgVar;
        this.o = 1;
        this.i = i;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = z2;
        this.n = optional9;
    }
}
