package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkc extends agmp implements agmq {
    @Deprecated
    public tkc(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tkd tkdVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tkf.a, agoxVar, akkwVar, tkdVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tka();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cI(0, tkf.a)));
    }

    public final wrh e() {
        return wrh.b(getInt(cI(1, tkf.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        wrh[] wrhVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, tkf.a)));
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
            agmp.ds(length, messageIdTypeArr, new tii(this, 20));
            if (db(1)) {
                if (z) {
                    int[] dk = dk(getString(cI(1, tkf.a)));
                    wrh[] wrhVarArr2 = new wrh[dk.length];
                    for (int i2 = 0; i2 < dk.length; i2++) {
                        wrh b = wrh.b(dk[i2]);
                        if (b != null) {
                            wrhVarArr2[i2] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    wrhVarArr = (wrh[]) agnc.z(null, wrhVarArr2, new wrh[0]);
                } else {
                    wrhVarArr = new wrh[]{e()};
                }
            } else {
                wrhVarArr = null;
            }
            agmp.ds(length, wrhVarArr, new tkk(this, 1));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr = tkf.a;
                    int i4 = tif.a;
                    tpk tpkVar = new tpk((byte[]) null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i3];
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i3];
                        tpkVar.aC(0);
                        tpkVar.b = messageIdType;
                    }
                    if (wrhVarArr != null) {
                        wrh wrhVar = wrhVarArr[i3];
                        tpkVar.aC(1);
                        tpkVar.a = wrhVar;
                    }
                    tka tkaVar = new tka();
                    tkaVar.ar(tpkVar.az());
                    tkaVar.a = (MessageIdType) tpkVar.b;
                    tkaVar.b = (wrh) tpkVar.a;
                    tkaVar.cF = tpkVar.aA();
                    alobVar.h(tkaVar);
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
