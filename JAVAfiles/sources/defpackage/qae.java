package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qae extends agmp implements agmq {
    @Deprecated
    public qae(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qah qahVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qal.a, agoxVar, akkwVar, qahVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qac();
    }

    public final Uri c() {
        String string = getString(cI(2, qal.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final pyz e() {
        return pzm.a(getString(cI(0, qal.a)));
    }

    public final qam f() {
        qam[] values = qam.values();
        int i = getInt(cI(1, qal.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        pyz[] pyzVarArr;
        qam[] qamVarArr;
        Uri[] uriArr;
        qel[] qelVarArr;
        apwj[] apwjVarArr;
        String[] strArr;
        int i;
        qep[] qepVarArr;
        apwj apwjVar;
        qel qelVar;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                qep qepVar = null;
                if (db(0)) {
                    if (z) {
                        String[] dm = dm(getString(cI(0, qal.a)));
                        int length2 = dm.length;
                        pyz[] pyzVarArr2 = new pyz[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            pyzVarArr2[i3] = pzm.a(dm[i3]);
                        }
                        pyzVarArr = (pyz[]) agnc.z(null, pyzVarArr2, new pyz[0]);
                    } else {
                        pyzVarArr = new pyz[]{e()};
                    }
                } else {
                    pyzVarArr = null;
                }
                agmp.ds(length, pyzVarArr, new nfd(this, 7));
                if (db(1)) {
                    if (z) {
                        int[] dk = dk(getString(cI(1, qal.a)));
                        qam[] values = qam.values();
                        int length3 = values.length;
                        qam[] qamVarArr2 = new qam[dk.length];
                        for (int i4 = 0; i4 < dk.length; i4++) {
                            int i5 = dk[i4];
                            if (i5 < length3) {
                                qamVarArr2[i4] = values[i5];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qamVarArr = (qam[]) agnc.z(null, qamVarArr2, new qam[0]);
                    } else {
                        qamVarArr = new qam[]{f()};
                    }
                } else {
                    qamVarArr = null;
                }
                agmp.ds(length, qamVarArr, new nfd(this, 8));
                if (db(2)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(2, qal.a)));
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
                        uriArr = new Uri[]{c()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new nfd(this, 9));
                if (db(3)) {
                    if (z) {
                        List cY = cY(getString(cI(3, qal.a)));
                        qel[] qelVarArr2 = new qel[cY.size()];
                        Iterator it = cY.iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i10 = i9 + 1;
                                if (v == null) {
                                    qelVar = null;
                                } else {
                                    try {
                                        qelVar = (qel) apag.parseFrom(qel.a, v);
                                    } catch (Throwable unused) {
                                        i9 = i10;
                                        qelVarArr2[i9] = null;
                                        i9++;
                                    }
                                }
                                qelVarArr2[i9] = qelVar;
                                i9 = i10;
                            } catch (Throwable unused2) {
                            }
                        }
                        qelVarArr = (qel[]) agnc.z(null, qelVarArr2, new qel[0]);
                    } else {
                        qelVarArr = new qel[]{g()};
                    }
                } else {
                    qelVarArr = null;
                }
                agmp.ds(length, qelVarArr, new nfd(this, 10));
                if (db(4)) {
                    if (z) {
                        List cY2 = cY(getString(cI(4, qal.a)));
                        apwj[] apwjVarArr2 = new apwj[cY2.size()];
                        Iterator it2 = cY2.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] v2 = agnc.v((String) it2.next());
                                int i12 = i11 + 1;
                                if (v2 == null) {
                                    apwjVar = null;
                                } else {
                                    try {
                                        apwjVar = (apwj) apag.parseFrom(apwj.a, v2);
                                    } catch (Throwable unused3) {
                                        i11 = i12;
                                        apwjVarArr2[i11] = null;
                                        i11++;
                                        i2 = 0;
                                    }
                                }
                                apwjVarArr2[i11] = apwjVar;
                                i11 = i12;
                            } catch (Throwable unused4) {
                            }
                            i2 = 0;
                        }
                        apwjVarArr = (apwj[]) agnc.z(null, apwjVarArr2, new apwj[i2]);
                    } else {
                        apwjVarArr = new apwj[]{i()};
                    }
                } else {
                    apwjVarArr = null;
                }
                agmp.ds(length, apwjVarArr, new nfd(this, 11));
                if (db(5)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(5, qal.a))), new String[0]);
                    } else {
                        strArr = new String[]{j()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new nfd(this, 12));
                if (db(6)) {
                    if (z) {
                        List cY3 = cY(getString(cI(6, qal.a)));
                        qep[] qepVarArr2 = new qep[cY3.size()];
                        Iterator it3 = cY3.iterator();
                        int i13 = 0;
                        while (it3.hasNext()) {
                            try {
                                byte[] v3 = agnc.v((String) it3.next());
                                int i14 = i13 + 1;
                                if (v3 != null) {
                                    try {
                                        qepVar = (qep) apag.parseFrom(qep.a, v3);
                                    } catch (Throwable unused5) {
                                        i13 = i14;
                                        qepVarArr2[i13] = null;
                                        i13++;
                                        qepVar = null;
                                    }
                                }
                                qepVarArr2[i13] = qepVar;
                                i13 = i14;
                                qepVar = null;
                            } catch (Throwable unused6) {
                            }
                        }
                        long[] jArr = qepVar;
                        i = 0;
                        qepVarArr = (qep[]) agnc.z(jArr, qepVarArr2, new qep[0]);
                    } else {
                        i = 0;
                        qepVarArr = new qep[]{h()};
                    }
                } else {
                    i = 0;
                    qepVarArr = null;
                }
                agmp.ds(length, qepVarArr, new nfd(this, 13));
                alob alobVar = new alob();
                while (i < length) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr2 = qal.a;
                        int i15 = qaa.a;
                        sdz sdzVar = new sdz(null);
                        sdzVar.aD();
                        sdzVar.aB();
                        long j2 = du[i];
                        if (pyzVarArr != null) {
                            sdzVar.f(pyzVarArr[i]);
                        }
                        if (qamVarArr != null) {
                            sdzVar.d(qamVarArr[i]);
                        }
                        if (uriArr != null) {
                            sdzVar.e(uriArr[i]);
                        }
                        if (qelVarArr != null) {
                            sdzVar.b(qelVarArr[i]);
                        }
                        if (apwjVarArr != null) {
                            sdzVar.c(apwjVarArr[i]);
                        }
                        if (strArr != null) {
                            sdzVar.g(strArr[i]);
                        }
                        if (qepVarArr != null) {
                            sdzVar.h(qepVarArr[i]);
                        }
                        alobVar.h(sdzVar.a());
                    }
                    i++;
                }
                return alobVar.g();
            }
        }
        int i16 = alog.d;
        return alsx.a;
    }

    public final qel g() {
        byte[] blob = getBlob(cI(3, qal.a));
        if (blob == null) {
            return null;
        }
        try {
            return (qel) apag.parseFrom(qel.a, blob, aozs.a());
        } catch (Throwable unused) {
            return qel.a;
        }
    }

    public final qep h() {
        byte[] blob = getBlob(cI(6, qal.a));
        if (blob == null) {
            return null;
        }
        try {
            return (qep) apag.parseFrom(qep.a, blob, aozs.a());
        } catch (Throwable unused) {
            return qep.a;
        }
    }

    public final apwj i() {
        byte[] blob = getBlob(cI(4, qal.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwj) apag.parseFrom(apwj.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwj.a;
        }
    }

    public final String j() {
        return getString(cI(5, qal.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
