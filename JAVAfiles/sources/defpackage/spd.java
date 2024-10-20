package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spd extends agmp implements agmq {
    @Deprecated
    public spd(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, spf spfVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, spj.a, agoxVar, akkwVar, spfVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new spa();
    }

    public final jpo c() {
        byte[] blob = getBlob(cI(2, spj.a));
        if (blob == null) {
            return null;
        }
        try {
            return (jpo) apag.parseFrom(jpo.a, blob, aozs.a());
        } catch (Throwable unused) {
            return jpo.a;
        }
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cI(0, spj.a)));
    }

    public final String f() {
        return getString(cI(5, spj.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        String[] strArr;
        jpo[] jpoVarArr;
        String[] strArr2;
        boolean[] zArr;
        String[] strArr3;
        jpo jpoVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                boolean[] zArr2 = null;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, spj.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{e()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new sok(this, 15));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, spj.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sok(this, 16));
                if (db(2)) {
                    if (z) {
                        List cY = cY(getString(cI(2, spj.a)));
                        jpo[] jpoVarArr2 = new jpo[cY.size()];
                        Iterator it = cY.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i3 = i2 + 1;
                                if (v == null) {
                                    jpoVar = null;
                                } else {
                                    try {
                                        jpoVar = (jpo) apag.parseFrom(jpo.a, v);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        jpoVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                jpoVarArr2[i2] = jpoVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        jpoVarArr = (jpo[]) agnc.z(null, jpoVarArr2, new jpo[0]);
                    } else {
                        jpoVarArr = new jpo[]{c()};
                    }
                } else {
                    jpoVarArr = null;
                }
                agmp.ds(length, jpoVarArr, new sok(this, 17));
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, spj.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sok(this, 18));
                if (db(4)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(4, spj.a))));
                    } else {
                        zArr = new boolean[]{j()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new sok(this, 19));
                if (db(5)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, spj.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{f()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new sok(this, 20));
                if (db(6)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(6, spj.a))));
                    } else {
                        zArr2 = new boolean[]{i()};
                    }
                }
                agmp.dt(length, zArr2, new spq(this, 1));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr4 = spj.a;
                        int i5 = sms.a;
                        spb spbVar = new spb();
                        spbVar.aD();
                        spbVar.aB();
                        long j2 = du[i4];
                        if (conversationIdTypeArr != null) {
                            spbVar.c(conversationIdTypeArr[i4]);
                        }
                        if (strArr != null) {
                            spbVar.h(strArr[i4]);
                        }
                        if (jpoVarArr != null) {
                            spbVar.b(jpoVarArr[i4]);
                        }
                        if (strArr2 != null) {
                            spbVar.g(strArr2[i4]);
                        }
                        if (zArr != null) {
                            spbVar.e(zArr[i4]);
                        }
                        if (strArr3 != null) {
                            spbVar.f(strArr3[i4]);
                        }
                        if (zArr2 != null) {
                            spbVar.d(zArr2[i4]);
                        }
                        alobVar.h(spbVar.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, spj.a));
    }

    public final String h() {
        return getString(cI(1, spj.a));
    }

    public final boolean i() {
        if (getInt(cI(6, spj.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (getInt(cI(4, spj.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
