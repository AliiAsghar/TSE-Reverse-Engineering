package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swq extends agmp implements agmq {
    @Deprecated
    public swq(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sws swsVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sww.a, agoxVar, akkwVar, swsVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new swl();
    }

    public final float c() {
        return getFloat(cI(4, sww.a));
    }

    public final int e() {
        return getInt(cI(10, sww.a));
    }

    public final int f() {
        return getInt(cI(12, sww.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        float[] fArr;
        amzp[] amzpVarArr;
        String[] strArr;
        long[] jArr2;
        long[] jArr3;
        amzf[] amzfVarArr;
        amzf[] amzfVarArr2;
        apzk[] apzkVarArr;
        int[] iArr2;
        int[] iArr3;
        apzk[] apzkVarArr2;
        amzq[] amzqVarArr;
        int i2;
        int[] iArr4;
        long[] jArr4;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sww.a))));
                    } else {
                        jArr = new long[]{i()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new svt(this, 15));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sww.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i4 = 0; i4 < length2; i4++) {
                            messageIdTypeArr2[i4] = new MessageIdType(dl[i4]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{k()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new swp(this, i3));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, sww.a)));
                        int length3 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                        int i5 = 0;
                        while (i5 < length3) {
                            conversationIdTypeArr2[i5] = new ConversationIdType(dl2[i5]);
                            i5++;
                            length = length;
                        }
                        i = length;
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        i = length;
                        conversationIdTypeArr = new ConversationIdType[]{j()};
                    }
                } else {
                    i = length;
                    conversationIdTypeArr = null;
                }
                int i6 = i;
                agmp.ds(i6, conversationIdTypeArr, new swp(this, 2));
                int i7 = 3;
                if (db(3)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(3, sww.a))));
                    } else {
                        iArr = new int[]{g()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(i6, iArr, new swp(this, i7));
                int i8 = 4;
                if (db(4)) {
                    if (z) {
                        fArr = agnc.D(dj(getString(cI(4, sww.a))));
                    } else {
                        fArr = new float[]{c()};
                    }
                } else {
                    fArr = null;
                }
                agmp.dp(i6, fArr, new swp(this, i8));
                if (db(5)) {
                    if (z) {
                        int[] dk = dk(getString(cI(5, sww.a)));
                        amzp[] amzpVarArr2 = new amzp[dk.length];
                        for (int i9 = 0; i9 < dk.length; i9++) {
                            amzp b = amzp.b(dk[i9]);
                            if (b != null) {
                                amzpVarArr2[i9] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        amzpVarArr = (amzp[]) agnc.z(null, amzpVarArr2, new amzp[0]);
                    } else {
                        amzpVarArr = new amzp[]{m()};
                    }
                } else {
                    amzpVarArr = null;
                }
                agmp.ds(i6, amzpVarArr, new swp(this, 5));
                int i10 = 6;
                if (db(6)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(6, sww.a))), new String[0]);
                    } else {
                        strArr = new String[]{p()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(i6, strArr, new swp(this, i10));
                if (db(7)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(7, sww.a))));
                    } else {
                        jArr2 = new long[]{h()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(i6, jArr2, new svt(this, 16));
                if (db(8)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(8, sww.a)));
                        amzf[] amzfVarArr3 = new amzf[dk2.length];
                        jArr3 = jArr2;
                        while (i3 < dk2.length) {
                            amzf b2 = amzf.b(dk2[i3]);
                            if (b2 != null) {
                                amzfVarArr3[i3] = b2;
                                i3++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        amzfVarArr = (amzf[]) agnc.z(null, amzfVarArr3, new amzf[0]);
                    } else {
                        jArr3 = jArr2;
                        amzfVarArr = new amzf[]{l()};
                    }
                } else {
                    jArr3 = jArr2;
                    amzfVarArr = null;
                }
                agmp.ds(i6, amzfVarArr, new svt(this, 17));
                if (db(9)) {
                    if (z) {
                        int[] dk3 = dk(getString(cI(9, sww.a)));
                        apzk[] apzkVarArr3 = new apzk[dk3.length];
                        amzfVarArr2 = amzfVarArr;
                        for (int i11 = 0; i11 < dk3.length; i11++) {
                            apzk b3 = apzk.b(dk3[i11]);
                            if (b3 != null) {
                                apzkVarArr3[i11] = b3;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        apzkVarArr = (apzk[]) agnc.z(null, apzkVarArr3, new apzk[0]);
                    } else {
                        amzfVarArr2 = amzfVarArr;
                        apzkVarArr = new apzk[]{o()};
                    }
                } else {
                    amzfVarArr2 = amzfVarArr;
                    apzkVarArr = null;
                }
                agmp.ds(i6, apzkVarArr, new svt(this, 18));
                if (db(10)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(10, sww.a))));
                    } else {
                        iArr2 = new int[]{e()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(i6, iArr2, new svt(this, 19));
                if (db(11)) {
                    if (z) {
                        int[] dk4 = dk(getString(cI(11, sww.a)));
                        amzq[] amzqVarArr2 = new amzq[dk4.length];
                        iArr3 = iArr2;
                        apzkVarArr2 = apzkVarArr;
                        for (int i12 = 0; i12 < dk4.length; i12++) {
                            amzq b4 = amzq.b(dk4[i12]);
                            if (b4 != null) {
                                amzqVarArr2[i12] = b4;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        amzqVarArr = (amzq[]) agnc.z(null, amzqVarArr2, new amzq[0]);
                    } else {
                        iArr3 = iArr2;
                        apzkVarArr2 = apzkVarArr;
                        amzqVarArr = new amzq[]{n()};
                    }
                } else {
                    iArr3 = iArr2;
                    apzkVarArr2 = apzkVarArr;
                    amzqVarArr = null;
                }
                agmp.ds(i6, amzqVarArr, new svt(this, 20));
                if (db(12)) {
                    if (z) {
                        iArr4 = agnc.w(null, dk(getString(cI(12, sww.a))));
                        i2 = 1;
                    } else {
                        i2 = 1;
                        iArr4 = new int[]{f()};
                    }
                } else {
                    i2 = 1;
                    iArr4 = null;
                }
                agmp.dq(i6, iArr4, new swp(this, i2));
                alob alobVar = new alob();
                int i13 = 0;
                while (i13 < i6) {
                    long j = du[i13];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i13]));
                        String[] strArr2 = sww.a;
                        int i14 = swm.a;
                        swn swnVar = new swn();
                        swnVar.aD();
                        swnVar.aB();
                        long j2 = du[i13];
                        jArr4 = du;
                        if (jArr != null) {
                            long j3 = jArr[i13];
                            hashSet = hashSet2;
                            swnVar.aC(0);
                            swnVar.a = j3;
                        } else {
                            hashSet = hashSet2;
                        }
                        if (messageIdTypeArr != null) {
                            swnVar.h(messageIdTypeArr[i13]);
                        }
                        if (conversationIdTypeArr != null) {
                            swnVar.f(conversationIdTypeArr[i13]);
                        }
                        if (iArr != null) {
                            swnVar.l(iArr[i13]);
                        }
                        if (fArr != null) {
                            swnVar.k(fArr[i13]);
                        }
                        if (amzpVarArr != null) {
                            swnVar.i(amzpVarArr[i13]);
                        }
                        if (strArr != null) {
                            swnVar.d(strArr[i13]);
                        }
                        if (jArr3 != null) {
                            swnVar.e(jArr3[i13]);
                        }
                        if (amzfVarArr2 != null) {
                            swnVar.m(amzfVarArr2[i13]);
                        }
                        if (apzkVarArr2 != null) {
                            swnVar.c(apzkVarArr2[i13]);
                        }
                        if (iArr3 != null) {
                            swnVar.b(iArr3[i13]);
                        }
                        if (amzqVarArr != null) {
                            swnVar.g(amzqVarArr[i13]);
                        }
                        if (iArr4 != null) {
                            swnVar.j(iArr4[i13]);
                        }
                        alobVar.h(swnVar.a());
                    } else {
                        jArr4 = du;
                        hashSet = hashSet2;
                    }
                    i13++;
                    du = jArr4;
                    hashSet2 = hashSet;
                }
                return alobVar.g();
            }
        }
        int i15 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(3, sww.a));
    }

    public final long h() {
        return getLong(cI(7, sww.a));
    }

    public final long i() {
        return getLong(cI(0, sww.a));
    }

    public final ConversationIdType j() {
        return new ConversationIdType(getLong(cI(2, sww.a)));
    }

    public final MessageIdType k() {
        return new MessageIdType(getLong(cI(1, sww.a)));
    }

    public final amzf l() {
        return amzf.b(getInt(cI(8, sww.a)));
    }

    public final amzp m() {
        return amzp.b(getInt(cI(5, sww.a)));
    }

    public final amzq n() {
        return amzq.b(getInt(cI(11, sww.a)));
    }

    public final apzk o() {
        return apzk.b(getInt(cI(9, sww.a)));
    }

    public final String p() {
        return getString(cI(6, sww.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
