package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skh extends agmp implements agmq {
    @Deprecated
    public skh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ski skiVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, skk.a, agoxVar, akkwVar, skiVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new skc();
    }

    public final int c() {
        return getInt(cI(2, skk.a));
    }

    public final int e() {
        return getInt(cI(10, skk.a));
    }

    public final int f() {
        return getInt(cI(11, skk.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        int[] iArr2;
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        Uri[] uriArr;
        int i;
        String[] strArr2;
        int[] iArr3;
        boolean[] zArr;
        long[] jArr2;
        int[] iArr4;
        int[] iArr5;
        long[] jArr3;
        MessageIdType[] messageIdTypeArr2;
        HashSet hashSet;
        alob alobVar;
        alob alobVar2;
        int[] iArr6;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, skk.a))));
                    } else {
                        jArr = new long[]{h()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sjg(this, 11));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, skk.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            conversationIdTypeArr2[i3] = new ConversationIdType(dl[i3]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{k()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new sjg(this, 16));
                if (db(2)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(2, skk.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new sjg(this, 17));
                if (db(3)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(3, skk.a)));
                        int length3 = dl2.length;
                        MessageIdType[] messageIdTypeArr3 = new MessageIdType[length3];
                        int i4 = 0;
                        while (i4 < length3) {
                            messageIdTypeArr3[i4] = new MessageIdType(dl2[i4]);
                            i4++;
                            iArr = iArr;
                        }
                        iArr2 = iArr;
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                    } else {
                        iArr2 = iArr;
                        messageIdTypeArr = new MessageIdType[]{l()};
                    }
                } else {
                    iArr2 = iArr;
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new sjg(this, 18));
                if (db(4)) {
                    if (z) {
                        String[] dm = dm(getString(cI(4, skk.a)));
                        for (int i5 = 0; i5 < dm.length; i5++) {
                            dm[i5] = yta.a(dm[i5]);
                        }
                        strArr = (String[]) agnc.z(null, dm, new String[0]);
                    } else {
                        strArr = new String[]{n()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sjg(this, 19));
                if (db(5)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(5, skk.a)));
                        int length4 = dm2.length;
                        Uri[] uriArr2 = new Uri[length4];
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < length4) {
                            String str = dm2[i6];
                            int i8 = i7 + 1;
                            if (str != null && str.length() != 0) {
                                uri = Uri.parse(str);
                            } else {
                                uri = null;
                            }
                            uriArr2[i7] = uri;
                            i6++;
                            i7 = i8;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr2, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{j()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new sjg(this, 20));
                if (db(6)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(6, skk.a))), new String[0]);
                        i = 1;
                    } else {
                        i = 1;
                        strArr2 = new String[]{m()};
                    }
                } else {
                    i = 1;
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new skg(this, i));
                if (db(7)) {
                    if (z) {
                        iArr3 = agnc.w(null, dk(getString(cI(7, skk.a))));
                    } else {
                        iArr3 = new int[]{g()};
                    }
                } else {
                    iArr3 = null;
                }
                agmp.dq(length, iArr3, new skg(this, i2));
                if (db(8)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(8, skk.a))));
                    } else {
                        zArr = new boolean[]{o()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new sjg(this, 12));
                if (db(9)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(9, skk.a))));
                    } else {
                        jArr2 = new long[]{i()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sjg(this, 13));
                if (db(10)) {
                    if (z) {
                        iArr6 = agnc.w(null, dk(getString(cI(10, skk.a))));
                    } else {
                        iArr6 = new int[]{e()};
                    }
                    iArr4 = iArr6;
                } else {
                    iArr4 = null;
                }
                long[] jArr4 = jArr2;
                agmp.dq(length, iArr4, new sjg(this, 14));
                if (db(11)) {
                    if (z) {
                        iArr5 = agnc.w(null, dk(getString(cI(11, skk.a))));
                    } else {
                        iArr5 = new int[]{f()};
                    }
                } else {
                    iArr5 = null;
                }
                agmp.dq(length, iArr5, new sjg(this, 15));
                alob alobVar3 = new alob();
                int i9 = 0;
                while (i9 < length) {
                    long j = du[i9];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i9]));
                        String[] strArr3 = skk.a;
                        int i10 = ske.a;
                        skd skdVar = new skd();
                        skdVar.aD();
                        skdVar.aB();
                        long j2 = du[i9];
                        if (jArr != null) {
                            hashSet = hashSet2;
                            alobVar2 = alobVar3;
                            long j3 = jArr[i9];
                            jArr3 = du;
                            skdVar.aC(0);
                            skdVar.a = j3;
                        } else {
                            jArr3 = du;
                            hashSet = hashSet2;
                            alobVar2 = alobVar3;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i9];
                            skdVar.aC(1);
                            skdVar.b = conversationIdType;
                        }
                        if (iArr2 != null) {
                            int i11 = iArr2[i9];
                            int i12 = skdVar.az;
                            if (i12 < 53020) {
                                agnc.t(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, i12);
                            }
                            skdVar.aC(2);
                            skdVar.c = i11;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i9];
                            skdVar.aC(3);
                            skdVar.d = messageIdType;
                        }
                        if (strArr != null) {
                            String str2 = strArr[i9];
                            int i13 = skdVar.az;
                            if (i13 < 53010) {
                                agnc.t("snippet_text", i13);
                            }
                            skdVar.aC(4);
                            if (!skdVar.aA) {
                                str2 = yta.a(str2);
                            }
                            skdVar.e = str2;
                        }
                        if (uriArr != null) {
                            Uri uri2 = uriArr[i9];
                            int i14 = skdVar.az;
                            if (i14 < 55040) {
                                agnc.t("preview_uri", i14);
                            }
                            skdVar.aC(5);
                            skdVar.f = uri2;
                        }
                        if (strArr2 != null) {
                            String str3 = strArr2[i9];
                            int i15 = skdVar.az;
                            if (i15 < 55040) {
                                agnc.t("preview_content_type", i15);
                            }
                            skdVar.aC(6);
                            skdVar.g = str3;
                        }
                        if (iArr3 != null) {
                            int i16 = iArr3[i9];
                            int i17 = skdVar.az;
                            if (i17 < 57050) {
                                agnc.t("message_status", i17);
                            }
                            skdVar.aC(7);
                            skdVar.h = i16;
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i9];
                            int i18 = skdVar.az;
                            if (i18 < 57050) {
                                agnc.t("read", i18);
                            }
                            skdVar.aC(8);
                            skdVar.i = z2;
                        }
                        if (jArr4 != null) {
                            long j4 = jArr4[i9];
                            int i19 = skdVar.az;
                            messageIdTypeArr2 = messageIdTypeArr;
                            if (i19 < 57050) {
                                agnc.t("received_timestamp", i19);
                            }
                            skdVar.aC(9);
                            skdVar.j = j4;
                        } else {
                            messageIdTypeArr2 = messageIdTypeArr;
                        }
                        if (iArr4 != null) {
                            int i20 = iArr4[i9];
                            int i21 = skdVar.az;
                            if (i21 < 57050) {
                                agnc.t("message_protocol", i21);
                            }
                            skdVar.aC(10);
                            skdVar.k = i20;
                        }
                        if (iArr5 != null) {
                            int i22 = iArr5[i9];
                            int i23 = skdVar.az;
                            if (i23 < 57050) {
                                agnc.t("raw_telephony_status", i23);
                            }
                            skdVar.aC(11);
                            skdVar.l = i22;
                        }
                        skc skcVar = new skc();
                        skcVar.ar(skdVar.az());
                        skcVar.a = skdVar.a;
                        skcVar.b = skdVar.b;
                        skcVar.c = skdVar.c;
                        skcVar.d = skdVar.d;
                        skcVar.e = skdVar.e;
                        skcVar.f = skdVar.f;
                        skcVar.g = skdVar.g;
                        skcVar.h = skdVar.h;
                        skcVar.i = skdVar.i;
                        skcVar.j = skdVar.j;
                        skcVar.k = skdVar.k;
                        skcVar.l = skdVar.l;
                        skcVar.cF = skdVar.aA();
                        alobVar = alobVar2;
                        alobVar.h(skcVar);
                    } else {
                        jArr3 = du;
                        messageIdTypeArr2 = messageIdTypeArr;
                        hashSet = hashSet2;
                        alobVar = alobVar3;
                    }
                    i9++;
                    alobVar3 = alobVar;
                    hashSet2 = hashSet;
                    du = jArr3;
                    messageIdTypeArr = messageIdTypeArr2;
                }
                return alobVar3.g();
            }
        }
        int i24 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(7, skk.a));
    }

    public final long h() {
        return getLong(cI(0, skk.a));
    }

    public final long i() {
        return getLong(cI(9, skk.a));
    }

    public final Uri j() {
        String string = getString(cI(5, skk.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ConversationIdType k() {
        return new ConversationIdType(getLong(cI(1, skk.a)));
    }

    public final MessageIdType l() {
        return new MessageIdType(getLong(cI(3, skk.a)));
    }

    public final String m() {
        return getString(cI(6, skk.a));
    }

    public final String n() {
        return yta.a(getString(cI(4, skk.a)));
    }

    public final boolean o() {
        if (getInt(cI(8, skk.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
