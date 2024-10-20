package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svl extends agmp implements agmq {
    @Deprecated
    public svl(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, svn svnVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, svq.a, agoxVar, akkwVar, svnVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new svj();
    }

    public final long c() {
        return getLong(cI(0, svq.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, svq.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(3, svq.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        wks[] wksVarArr;
        int i;
        MessageIdType[] messageIdTypeArr2;
        wky[] wkyVarArr;
        wku[] wkuVarArr;
        wku[] wkuVarArr2;
        MessageIdType[] messageIdTypeArr3;
        wku wkuVar;
        wku wkuVar2;
        wks wksVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, svq.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sum(this, 12));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, svq.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr4 = new MessageIdType[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            messageIdTypeArr4[i3] = new MessageIdType(dl[i3]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new sum(this, 13));
                if (db(2)) {
                    if (z) {
                        List cY = cY(getString(cI(2, svq.a)));
                        wks[] wksVarArr2 = new wks[cY.size()];
                        Iterator it = cY.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i5 = i4 + 1;
                                if (v == null) {
                                    wksVar = null;
                                } else {
                                    try {
                                        wksVar = (wks) apag.parseFrom(wks.a, v);
                                    } catch (Throwable unused) {
                                        i4 = i5;
                                        wksVarArr2[i4] = null;
                                        i4++;
                                    }
                                }
                                wksVarArr2[i4] = wksVar;
                                i4 = i5;
                            } catch (Throwable unused2) {
                            }
                        }
                        wksVarArr = (wks[]) agnc.z(null, wksVarArr2, new wks[0]);
                    } else {
                        wksVarArr = new wks[]{g()};
                    }
                } else {
                    wksVarArr = null;
                }
                agmp.ds(length, wksVarArr, new sum(this, 14));
                if (db(3)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(3, svq.a)));
                        int length3 = dl2.length;
                        MessageIdType[] messageIdTypeArr5 = new MessageIdType[length3];
                        int i6 = 0;
                        while (i6 < length3) {
                            messageIdTypeArr5[i6] = new MessageIdType(dl2[i6]);
                            i6++;
                            length = length;
                        }
                        i = length;
                        messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr5, new MessageIdType[0]);
                    } else {
                        i = length;
                        messageIdTypeArr2 = new MessageIdType[]{f()};
                    }
                } else {
                    i = length;
                    messageIdTypeArr2 = null;
                }
                int i7 = i;
                agmp.ds(i7, messageIdTypeArr2, new sum(this, 15));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, svq.a)));
                        wky[] wkyVarArr2 = new wky[dk.length];
                        for (int i8 = 0; i8 < dk.length; i8++) {
                            wky b = wky.b(dk[i8]);
                            if (b != null) {
                                wkyVarArr2[i8] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        wkyVarArr = (wky[]) agnc.z(null, wkyVarArr2, new wky[0]);
                    } else {
                        wkyVarArr = new wky[]{j()};
                    }
                } else {
                    wkyVarArr = null;
                }
                agmp.ds(i7, wkyVarArr, new sum(this, 16));
                if (db(5)) {
                    if (z) {
                        List cY2 = cY(getString(cI(5, svq.a)));
                        wku[] wkuVarArr3 = new wku[cY2.size()];
                        Iterator it2 = cY2.iterator();
                        int i9 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] v2 = agnc.v((String) it2.next());
                                int i10 = i9 + 1;
                                if (v2 == null) {
                                    wkuVar2 = null;
                                } else {
                                    try {
                                        wkuVar2 = (wku) apag.parseFrom(wku.a, v2);
                                    } catch (Throwable unused3) {
                                        i9 = i10;
                                        wkuVarArr3[i9] = null;
                                        i9++;
                                        i2 = 0;
                                    }
                                }
                                wkuVarArr3[i9] = wkuVar2;
                                i9 = i10;
                            } catch (Throwable unused4) {
                            }
                            i2 = 0;
                        }
                        wkuVarArr = (wku[]) agnc.z(null, wkuVarArr3, new wku[i2]);
                    } else {
                        wkuVarArr = new wku[]{i()};
                    }
                } else {
                    wkuVarArr = null;
                }
                agmp.ds(i7, wkuVarArr, new sum(this, 17));
                if (db(6)) {
                    if (z) {
                        List cY3 = cY(getString(cI(6, svq.a)));
                        wku[] wkuVarArr4 = new wku[cY3.size()];
                        Iterator it3 = cY3.iterator();
                        int i11 = 0;
                        while (it3.hasNext()) {
                            try {
                                byte[] v3 = agnc.v((String) it3.next());
                                int i12 = i11 + 1;
                                if (v3 == null) {
                                    wkuVar = null;
                                } else {
                                    try {
                                        wkuVar = (wku) apag.parseFrom(wku.a, v3);
                                    } catch (Throwable unused5) {
                                        i11 = i12;
                                        wkuVarArr4[i11] = null;
                                        i11++;
                                    }
                                }
                                wkuVarArr4[i11] = wkuVar;
                                i11 = i12;
                            } catch (Throwable unused6) {
                            }
                        }
                        wkuVarArr2 = (wku[]) agnc.z(null, wkuVarArr4, new wku[0]);
                    } else {
                        wkuVarArr2 = new wku[]{h()};
                    }
                } else {
                    wkuVarArr2 = null;
                }
                agmp.ds(i7, wkuVarArr2, new sum(this, 18));
                alob alobVar = new alob();
                int i13 = 0;
                while (i13 < i7) {
                    long j = du[i13];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i13]));
                        String[] strArr = svq.a;
                        int i14 = svc.a;
                        toy toyVar = new toy(bArr, bArr);
                        toyVar.aD();
                        toyVar.aB();
                        long j2 = du[i13];
                        messageIdTypeArr3 = messageIdTypeArr;
                        if (jArr != null) {
                            long j3 = jArr[i13];
                            toyVar.aC(0);
                            toyVar.a = j3;
                        }
                        if (messageIdTypeArr3 != null) {
                            toyVar.m(messageIdTypeArr3[i13]);
                        }
                        if (wksVarArr != null) {
                            toyVar.o(wksVarArr[i13]);
                        }
                        if (messageIdTypeArr2 != null) {
                            MessageIdType messageIdType = messageIdTypeArr2[i13];
                            int i15 = toyVar.az;
                            if (i15 < 46020) {
                                agnc.t("reacted_message_id", i15);
                            }
                            toyVar.aC(3);
                            toyVar.g = messageIdType;
                        }
                        if (wkyVarArr != null) {
                            toyVar.n(wkyVarArr[i13]);
                        }
                        if (wkuVarArr != null) {
                            wku wkuVar3 = wkuVarArr[i13];
                            int i16 = toyVar.az;
                            if (i16 < 59060) {
                                agnc.t("applied_reaction", i16);
                            }
                            toyVar.aC(5);
                            toyVar.b = wkuVar3;
                        }
                        if (wkuVarArr2 != null) {
                            wku wkuVar4 = wkuVarArr2[i13];
                            int i17 = toyVar.az;
                            if (i17 < 59520) {
                                agnc.t("animation_effect", i17);
                            }
                            toyVar.aC(6);
                            toyVar.c = wkuVar4;
                        }
                        alobVar.h(toyVar.l(new svc(5)));
                    } else {
                        messageIdTypeArr3 = messageIdTypeArr;
                    }
                    i13++;
                    messageIdTypeArr = messageIdTypeArr3;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i18 = alog.d;
        return alsx.a;
    }

    public final wks g() {
        byte[] blob = getBlob(cI(2, svq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wks) apag.parseFrom(wks.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wks.a;
        }
    }

    public final wku h() {
        byte[] blob = getBlob(cI(6, svq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wku) apag.parseFrom(wku.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wku.a;
        }
    }

    public final wku i() {
        byte[] blob = getBlob(cI(5, svq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wku) apag.parseFrom(wku.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wku.a;
        }
    }

    public final wky j() {
        return wky.b(getInt(cI(4, svq.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
