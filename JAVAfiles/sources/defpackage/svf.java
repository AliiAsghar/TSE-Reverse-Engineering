package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svf extends agmp implements agmq {
    @Deprecated
    public svf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, svg svgVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, svi.a, agoxVar, akkwVar, svgVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new svd();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cI(0, svi.a)));
    }

    public final voe e() {
        byte[] blob = getBlob(cI(1, svi.a));
        if (blob == null) {
            return null;
        }
        try {
            return (voe) apag.parseFrom(voe.a, blob, aozs.a());
        } catch (Throwable unused) {
            return voe.a;
        }
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        voe[] voeVarArr;
        voe voeVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, svi.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(dl[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{c()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new sum(this, 10));
            if (db(1)) {
                if (z) {
                    List cY = cY(getString(cI(1, svi.a)));
                    voe[] voeVarArr2 = new voe[cY.size()];
                    Iterator it = cY.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it.next());
                            int i3 = i2 + 1;
                            if (v == null) {
                                voeVar = null;
                            } else {
                                try {
                                    voeVar = (voe) apag.parseFrom(voe.a, v);
                                } catch (Throwable unused) {
                                    i2 = i3;
                                    voeVarArr2[i2] = null;
                                    i2++;
                                }
                            }
                            voeVarArr2[i2] = voeVar;
                            i2 = i3;
                        } catch (Throwable unused2) {
                        }
                    }
                    voeVarArr = (voe[]) agnc.z(null, voeVarArr2, new voe[0]);
                } else {
                    voeVarArr = new voe[]{e()};
                }
            } else {
                voeVarArr = null;
            }
            agmp.ds(length, voeVarArr, new sum(this, 11));
            alob alobVar = new alob();
            for (int i4 = 0; i4 < length; i4++) {
                long j = du[i4];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i4]));
                    String[] strArr = svi.a;
                    int i5 = svc.a;
                    tpk tpkVar = new tpk((byte[]) null, (byte[]) null, (byte[]) null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i4];
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i4];
                        tpkVar.aC(0);
                        tpkVar.a = messageIdType;
                    }
                    if (voeVarArr != null) {
                        voe voeVar2 = voeVarArr[i4];
                        tpkVar.aC(1);
                        tpkVar.b = voeVar2;
                    }
                    svd svdVar = new svd();
                    svdVar.ar(tpkVar.az());
                    svdVar.a = (MessageIdType) tpkVar.a;
                    svdVar.b = (voe) tpkVar.b;
                    svdVar.cF = tpkVar.aA();
                    alobVar.h(svdVar);
                }
            }
            return alobVar.g();
        }
        int i6 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
