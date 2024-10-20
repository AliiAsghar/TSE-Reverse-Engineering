package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rns extends agmp implements agmq {
    @Deprecated
    public rns(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rnu rnuVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rnx.a, agoxVar, akkwVar, rnuVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rno();
    }

    public final double c() {
        return getDouble(cI(8, rnx.a));
    }

    public final double e() {
        return getDouble(cI(7, rnx.a));
    }

    public final int f() {
        return getInt(cI(6, rnx.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        int[] iArr;
        String[] strArr2;
        int[] iArr2;
        int[] iArr3;
        double[] dArr;
        double[] dArr2;
        double[] dArr3;
        String[] strArr3;
        byte[][] bArr;
        byte[][] bArr2;
        byte[][] bArr3;
        String[] strArr4;
        String[] strArr5;
        long[] jArr2;
        int i;
        alob alobVar;
        HashSet hashSet;
        String[] strArr6;
        alob alobVar2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, rnx.a))));
                } else {
                    jArr = new long[]{i()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new rng(this, 20));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, rnx.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{j()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new rnr(this, 8));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, rnx.a))), new String[0]);
                } else {
                    strArr = new String[]{m()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new rnr(this, 9));
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, rnx.a))));
                } else {
                    iArr = new int[]{g()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new rnr(this, 10));
            if (db(4)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, rnx.a))), new String[0]);
                } else {
                    strArr2 = new String[]{o()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new rnr(this, 11));
            if (db(5)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(5, rnx.a))));
                } else {
                    iArr2 = new int[]{h()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new rnr(this, 12));
            if (db(6)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(6, rnx.a))));
                } else {
                    iArr3 = new int[]{f()};
                }
            } else {
                iArr3 = null;
            }
            agmp.dq(length, iArr3, new rnr(this, 1));
            if (db(7)) {
                if (z) {
                    dArr = agnc.C(di(getString(cI(7, rnx.a))));
                } else {
                    dArr = new double[]{e()};
                }
            } else {
                dArr = null;
            }
            agmp.m44do(length, dArr, new rnr(this, 0));
            if (db(8)) {
                if (z) {
                    dArr2 = agnc.C(di(getString(cI(8, rnx.a))));
                } else {
                    dArr2 = new double[]{c()};
                }
            } else {
                dArr2 = null;
            }
            agmp.m44do(length, dArr2, new rnr(this, 2));
            if (db(9)) {
                if (z) {
                    dArr3 = dArr2;
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(9, rnx.a))), new String[0]);
                } else {
                    dArr3 = dArr2;
                    strArr3 = new String[]{l()};
                }
            } else {
                dArr3 = dArr2;
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new rnr(this, 3));
            if (db(10)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(10, rnx.a))));
                } else {
                    bArr = new byte[][]{q()};
                }
            } else {
                bArr = null;
            }
            String[] strArr7 = strArr3;
            agmp.ds(length, bArr, new rnr(this, 4));
            if (db(11)) {
                if (z) {
                    bArr2 = agnc.B(null, dv(getString(cI(11, rnx.a))));
                } else {
                    bArr2 = new byte[][]{p()};
                }
            } else {
                bArr2 = null;
            }
            byte[][] bArr4 = bArr;
            agmp.ds(length, bArr2, new rnr(this, 5));
            if (db(12)) {
                if (z) {
                    bArr3 = bArr2;
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(12, rnx.a))), new String[0]);
                } else {
                    bArr3 = bArr2;
                    strArr4 = new String[]{k()};
                }
            } else {
                bArr3 = bArr2;
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new rnr(this, 6));
            if (db(13)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(13, rnx.a))), new String[0]);
                } else {
                    strArr5 = new String[]{n()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new rnr(this, 7));
            alob alobVar3 = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i3]));
                    String[] strArr8 = rnx.a;
                    int i4 = rlm.a;
                    rnp rnpVar = new rnp();
                    rnpVar.aD();
                    rnpVar.aB();
                    long j2 = du[i3];
                    if (jArr != null) {
                        i = length;
                        alobVar2 = alobVar3;
                        long j3 = jArr[i3];
                        jArr2 = du;
                        rnpVar.aC(0);
                        rnpVar.a = j3;
                    } else {
                        jArr2 = du;
                        i = length;
                        alobVar2 = alobVar3;
                    }
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i3];
                        int i5 = rnpVar.az;
                        if (i5 < 0) {
                            agnc.t("message_id", i5);
                        }
                        rnpVar.aC(1);
                        rnpVar.b = messageIdType;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        int i6 = rnpVar.az;
                        if (i6 < 0) {
                            agnc.t("content_type", i6);
                        }
                        rnpVar.aC(2);
                        rnpVar.c = str;
                    }
                    if (iArr != null) {
                        int i7 = iArr[i3];
                        int i8 = rnpVar.az;
                        if (i8 < 10) {
                            agnc.t("source", i8);
                        }
                        rnpVar.aC(3);
                        rnpVar.d = i7;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        int i9 = rnpVar.az;
                        if (i9 < 0) {
                            agnc.t(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, i9);
                        }
                        rnpVar.aC(4);
                        rnpVar.e = str2;
                    }
                    if (iArr2 != null) {
                        int i10 = iArr2[i3];
                        int i11 = rnpVar.az;
                        if (i11 < 0) {
                            agnc.t("width", i11);
                        }
                        rnpVar.aC(5);
                        rnpVar.f = i10;
                    }
                    if (iArr3 != null) {
                        int i12 = iArr3[i3];
                        int i13 = rnpVar.az;
                        if (i13 < 0) {
                            agnc.t("height", i13);
                        }
                        rnpVar.aC(6);
                        rnpVar.g = i12;
                    }
                    if (dArr != null) {
                        double d = dArr[i3];
                        int i14 = rnpVar.az;
                        hashSet = hashSet2;
                        if (i14 < 0) {
                            agnc.t("longitude", i14);
                        }
                        rnpVar.aC(7);
                        rnpVar.h = d;
                    } else {
                        hashSet = hashSet2;
                    }
                    if (dArr3 != null) {
                        double d2 = dArr3[i3];
                        int i15 = rnpVar.az;
                        if (i15 < 0) {
                            agnc.t("latitude", i15);
                        }
                        rnpVar.aC(8);
                        rnpVar.i = d2;
                    }
                    if (strArr7 != null) {
                        String str3 = strArr7[i3];
                        int i16 = rnpVar.az;
                        if (i16 < 0) {
                            agnc.t("cms_full_size_blob_id", i16);
                        }
                        rnpVar.aC(9);
                        rnpVar.j = str3;
                    }
                    if (bArr4 != null) {
                        byte[] bArr5 = bArr4[i3];
                        int i17 = rnpVar.az;
                        if (i17 < 0) {
                            agnc.t("cms_media_encryption_key", i17);
                        }
                        rnpVar.aC(10);
                        rnpVar.k = bArr5;
                    }
                    if (bArr3 != null) {
                        byte[] bArr6 = bArr3[i3];
                        int i18 = rnpVar.az;
                        if (i18 < 0) {
                            agnc.t("cms_compressed_media_encryption_key", i18);
                        }
                        rnpVar.aC(11);
                        rnpVar.l = bArr6;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i3];
                        int i19 = rnpVar.az;
                        if (i19 < 0) {
                            agnc.t("cms_compressed_blob_id", i19);
                        }
                        rnpVar.aC(12);
                        rnpVar.m = str4;
                    }
                    if (strArr5 != null) {
                        String str5 = strArr5[i3];
                        int i20 = rnpVar.az;
                        if (i20 < 100) {
                            agnc.t("file_name", i20);
                        }
                        rnpVar.aC(13);
                        rnpVar.n = str5;
                    }
                    rno rnoVar = new rno();
                    rnoVar.ar(rnpVar.az());
                    strArr6 = strArr5;
                    rnoVar.a = rnpVar.a;
                    rnoVar.b = rnpVar.b;
                    rnoVar.c = rnpVar.c;
                    rnoVar.d = rnpVar.d;
                    rnoVar.e = rnpVar.e;
                    rnoVar.f = rnpVar.f;
                    rnoVar.g = rnpVar.g;
                    rnoVar.h = rnpVar.h;
                    rnoVar.i = rnpVar.i;
                    rnoVar.j = rnpVar.j;
                    rnoVar.k = rnpVar.k;
                    rnoVar.l = rnpVar.l;
                    rnoVar.m = rnpVar.m;
                    rnoVar.n = rnpVar.n;
                    rnoVar.cF = rnpVar.aA();
                    alobVar = alobVar2;
                    alobVar.h(rnoVar);
                } else {
                    jArr2 = du;
                    i = length;
                    alobVar = alobVar3;
                    hashSet = hashSet2;
                    strArr6 = strArr5;
                }
                i3++;
                alobVar3 = alobVar;
                strArr5 = strArr6;
                length = i;
                du = jArr2;
                hashSet2 = hashSet;
            }
            return alobVar3.g();
        }
        int i21 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(3, rnx.a));
    }

    public final int h() {
        return getInt(cI(5, rnx.a));
    }

    public final long i() {
        return getLong(cI(0, rnx.a));
    }

    public final MessageIdType j() {
        return new MessageIdType(getLong(cI(1, rnx.a)));
    }

    public final String k() {
        return getString(cI(12, rnx.a));
    }

    public final String l() {
        return getString(cI(9, rnx.a));
    }

    public final String m() {
        return getString(cI(2, rnx.a));
    }

    public final String n() {
        return getString(cI(13, rnx.a));
    }

    public final String o() {
        return getString(cI(4, rnx.a));
    }

    public final byte[] p() {
        return getBlob(cI(11, rnx.a));
    }

    public final byte[] q() {
        return getBlob(cI(10, rnx.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
