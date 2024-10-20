package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szp extends agmp implements agmq {
    @Deprecated
    public szp(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, szr szrVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, szu.a, agoxVar, akkwVar, szrVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new szn();
    }

    public final long c() {
        return getLong(cI(2, szu.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, szu.a)));
    }

    public final aqba f() {
        return aqba.b(getInt(cI(5, szu.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        aqcz[] aqczVarArr;
        aqbc[] aqbcVarArr;
        aqba[] aqbaVarArr;
        aqbb[] aqbbVarArr;
        HashSet hashSet;
        aqcz aqczVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, szu.a))), new String[0]);
                    } else {
                        strArr = new String[]{j()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new szh(this, 4));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, szu.a)));
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
                agmp.ds(length, messageIdTypeArr, new szh(this, 5));
                if (db(2)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(2, szu.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new szh(this, 6));
                if (db(3)) {
                    if (z) {
                        if (!isNull(cI(3, szu.a))) {
                            List cY = cY(getString(cI(3, szu.a)));
                            aqcz[] aqczVarArr2 = new aqcz[cY.size()];
                            Iterator it = cY.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                try {
                                    byte[] v = agnc.v((String) it.next());
                                    int i4 = i3 + 1;
                                    if (v == null) {
                                        aqczVar = null;
                                    } else {
                                        try {
                                            aqczVar = (aqcz) apag.parseFrom(aqcz.a, v);
                                        } catch (Throwable unused) {
                                            i3 = i4;
                                            aqczVarArr2[i3] = null;
                                            i3++;
                                        }
                                    }
                                    aqczVarArr2[i3] = aqczVar;
                                    i3 = i4;
                                } catch (Throwable unused2) {
                                }
                            }
                            aqczVarArr = (aqcz[]) agnc.z(null, aqczVarArr2, new aqcz[0]);
                        } else {
                            throw new IllegalStateException("found null in cursor for column suggestion");
                        }
                    } else {
                        aqczVarArr = new aqcz[]{i()};
                    }
                } else {
                    aqczVarArr = null;
                }
                agmp.ds(length, aqczVarArr, new szh(this, 7));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, szu.a)));
                        aqbc[] aqbcVarArr2 = new aqbc[dk.length];
                        for (int i5 = 0; i5 < dk.length; i5++) {
                            aqbc b = aqbc.b(dk[i5]);
                            if (b != null) {
                                aqbcVarArr2[i5] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        aqbcVarArr = (aqbc[]) agnc.z(null, aqbcVarArr2, new aqbc[0]);
                    } else {
                        aqbcVarArr = new aqbc[]{h()};
                    }
                } else {
                    aqbcVarArr = null;
                }
                agmp.ds(length, aqbcVarArr, new szh(this, 8));
                if (db(5)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(5, szu.a)));
                        aqba[] aqbaVarArr2 = new aqba[dk2.length];
                        for (int i6 = 0; i6 < dk2.length; i6++) {
                            aqba b2 = aqba.b(dk2[i6]);
                            if (b2 != null) {
                                aqbaVarArr2[i6] = b2;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        aqbaVarArr = (aqba[]) agnc.z(null, aqbaVarArr2, new aqba[0]);
                    } else {
                        aqbaVarArr = new aqba[]{f()};
                    }
                } else {
                    aqbaVarArr = null;
                }
                agmp.ds(length, aqbaVarArr, new szh(this, 9));
                if (db(6)) {
                    if (z) {
                        int[] dk3 = dk(getString(cI(6, szu.a)));
                        aqbb[] aqbbVarArr2 = new aqbb[dk3.length];
                        for (int i7 = 0; i7 < dk3.length; i7++) {
                            aqbb b3 = aqbb.b(dk3[i7]);
                            if (b3 != null) {
                                aqbbVarArr2[i7] = b3;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        aqbbVarArr = (aqbb[]) agnc.z(null, aqbbVarArr2, new aqbb[0]);
                    } else {
                        aqbbVarArr = new aqbb[]{g()};
                    }
                } else {
                    aqbbVarArr = null;
                }
                agmp.ds(length, aqbbVarArr, new szh(this, 10));
                alob alobVar = new alob();
                int i8 = 0;
                while (i8 < length) {
                    long j = du[i8];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i8]));
                        String[] strArr2 = szu.a;
                        int i9 = sym.a;
                        toy toyVar = new toy(bArr);
                        toyVar.aD();
                        toyVar.aB();
                        long j2 = du[i8];
                        if (strArr != null) {
                            String str = strArr[i8];
                            toyVar.aC(i);
                            toyVar.d = str;
                        }
                        if (messageIdTypeArr != null) {
                            toyVar.k(messageIdTypeArr[i8]);
                        }
                        hashSet = hashSet2;
                        if (jArr != null) {
                            long j3 = jArr[i8];
                            toyVar.aC(2);
                            toyVar.a = j3;
                        }
                        if (aqczVarArr != null) {
                            toyVar.j(aqczVarArr[i8]);
                        }
                        if (aqbcVarArr != null) {
                            aqbc aqbcVar = aqbcVarArr[i8];
                            toyVar.aC(4);
                            toyVar.c = aqbcVar;
                        }
                        if (aqbaVarArr != null) {
                            aqba aqbaVar = aqbaVarArr[i8];
                            toyVar.aC(5);
                            toyVar.g = aqbaVar;
                        }
                        if (aqbbVarArr != null) {
                            aqbb aqbbVar = aqbbVarArr[i8];
                            int i10 = toyVar.az;
                            if (i10 < 53080) {
                                agnc.t("consumption_state", i10);
                            }
                            toyVar.aC(6);
                            toyVar.e = aqbbVar;
                        }
                        alobVar.h(toyVar.i(new sym(7)));
                    } else {
                        hashSet = hashSet2;
                    }
                    i8++;
                    hashSet2 = hashSet;
                    i = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i11 = alog.d;
        return alsx.a;
    }

    public final aqbb g() {
        return aqbb.b(getInt(cI(6, szu.a)));
    }

    public final aqbc h() {
        return aqbc.b(getInt(cI(4, szu.a)));
    }

    public final aqcz i() {
        if (!isNull(cI(3, szu.a))) {
            byte[] blob = getBlob(cI(3, szu.a));
            if (blob == null) {
                return null;
            }
            try {
                return (aqcz) apag.parseFrom(aqcz.a, blob, aozs.a());
            } catch (Throwable unused) {
                return aqcz.a;
            }
        }
        throw new IllegalStateException("found null in cursor for column suggestion");
    }

    public final String j() {
        return getString(cI(0, szu.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
