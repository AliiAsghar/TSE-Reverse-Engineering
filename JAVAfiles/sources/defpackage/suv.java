package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class suv extends agmp implements agmq {
    @Deprecated
    public suv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, suw suwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, suz.a, agoxVar, akkwVar, suwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sus();
    }

    public final int c() {
        return getInt(cI(2, suz.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, suz.a)));
    }

    public final sva f() {
        sva[] values = sva.values();
        int i = getInt(cI(3, suz.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        int[] iArr;
        sva[] svaVarArr;
        svb[] svbVarArr;
        String[] strArr2;
        String[] strArr3;
        long[] jArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, suz.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sum(this, 3));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, suz.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new sum(this, 4));
                if (db(2)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(2, suz.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new sum(this, 5));
                if (db(3)) {
                    if (z) {
                        int[] dk = dk(getString(cI(3, suz.a)));
                        sva[] values = sva.values();
                        int length3 = values.length;
                        sva[] svaVarArr2 = new sva[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            int i4 = dk[i3];
                            if (i4 < length3) {
                                svaVarArr2[i3] = values[i4];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        svaVarArr = (sva[]) agnc.z(null, svaVarArr2, new sva[0]);
                    } else {
                        svaVarArr = new sva[]{f()};
                    }
                } else {
                    svaVarArr = null;
                }
                agmp.ds(length, svaVarArr, new sum(this, 6));
                if (db(4)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(4, suz.a)));
                        svb[] values2 = svb.values();
                        int length4 = values2.length;
                        svb[] svbVarArr2 = new svb[dk2.length];
                        for (int i5 = 0; i5 < dk2.length; i5++) {
                            int i6 = dk2[i5];
                            if (i6 < length4) {
                                svbVarArr2[i5] = values2[i6];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        svbVarArr = (svb[]) agnc.z(null, svbVarArr2, new svb[0]);
                    } else {
                        svbVarArr = new svb[]{g()};
                    }
                } else {
                    svbVarArr = null;
                }
                agmp.ds(length, svbVarArr, new sum(this, 7));
                if (db(5)) {
                    if (z) {
                        if (!isNull(cI(5, suz.a))) {
                            strArr2 = (String[]) agnc.z(null, dm(getString(cI(5, suz.a))), new String[0]);
                        } else {
                            throw new IllegalStateException("found null in cursor for column intent");
                        }
                    } else {
                        strArr2 = new String[]{i()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sum(this, 8));
                if (db(6)) {
                    if (z) {
                        if (!isNull(cI(6, suz.a))) {
                            strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, suz.a))), new String[0]);
                        } else {
                            throw new IllegalStateException("found null in cursor for column model_id");
                        }
                    } else {
                        strArr3 = new String[]{j()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new sum(this, 9));
                alob alobVar = new alob();
                int i7 = 0;
                while (i7 < length) {
                    long j = du[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i7]));
                        String[] strArr4 = suz.a;
                        int i8 = ssv.a;
                        sut sutVar = new sut();
                        sutVar.aD();
                        sutVar.aB();
                        long j2 = du[i7];
                        if (strArr != null) {
                            String str = strArr[i7];
                            sutVar.aC(i);
                            sutVar.a = str;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i7];
                            sutVar.aC(1);
                            sutVar.b = messageIdType;
                        }
                        if (iArr != null) {
                            int i9 = iArr[i7];
                            sutVar.aC(2);
                            sutVar.c = i9;
                        }
                        if (svaVarArr != null) {
                            sva svaVar = svaVarArr[i7];
                            int i10 = sutVar.az;
                            if (i10 < 53060) {
                                agnc.t("confidence", i10);
                            }
                            sutVar.aC(3);
                            sutVar.d = svaVar;
                        }
                        if (svbVarArr != null) {
                            svb svbVar = svbVarArr[i7];
                            sutVar.aC(4);
                            sutVar.e = svbVar;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i7];
                            int i11 = sutVar.az;
                            if (i11 < 58590) {
                                agnc.t("intent", i11);
                            }
                            sutVar.aC(5);
                            sutVar.f = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i7];
                            sutVar.aC(6);
                            sutVar.g = str3;
                        }
                        sus susVar = new sus();
                        susVar.ar(sutVar.az());
                        String str4 = sutVar.f;
                        if (str4 != null) {
                            String str5 = sutVar.g;
                            if (str5 != null) {
                                jArr = du;
                                susVar.a = sutVar.a;
                                susVar.b = sutVar.b;
                                susVar.c = sutVar.c;
                                susVar.d = sutVar.d;
                                susVar.e = sutVar.e;
                                susVar.f = str4;
                                susVar.g = str5;
                                susVar.cF = sutVar.aA();
                                alobVar.h(susVar);
                            } else {
                                throw new IllegalStateException("field model_id cannot be null");
                            }
                        } else {
                            throw new IllegalStateException("field intent cannot be null");
                        }
                    } else {
                        jArr = du;
                    }
                    i7++;
                    du = jArr;
                    i = 0;
                }
                return alobVar.g();
            }
        }
        int i12 = alog.d;
        return alsx.a;
    }

    public final svb g() {
        svb[] values = svb.values();
        int i = getInt(cI(4, suz.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String h() {
        return getString(cI(0, suz.a));
    }

    public final String i() {
        if (!isNull(cI(5, suz.a))) {
            return getString(cI(5, suz.a));
        }
        throw new IllegalStateException("found null in cursor for column intent");
    }

    public final String j() {
        if (!isNull(cI(6, suz.a))) {
            return getString(cI(6, suz.a));
        }
        throw new IllegalStateException("found null in cursor for column model_id");
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
