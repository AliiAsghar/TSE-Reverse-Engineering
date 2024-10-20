package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abtp implements ackd {
    protected final DataHolder a;
    protected int b;
    private int c;

    public abtp(DataHolder dataHolder, int i) {
        abhg.m(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        abhg.h(z);
        this.b = i;
        this.c = dataHolder.a(i);
    }

    @Override // defpackage.abtr
    public /* synthetic */ Object d() {
        return new aclh(this);
    }

    @Override // defpackage.ackd
    public final String e() {
        return gp("asset_key");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abtp) {
            abtp abtpVar = (abtp) obj;
            if (d.B(Integer.valueOf(abtpVar.b), Integer.valueOf(this.b)) && d.B(Integer.valueOf(abtpVar.c), Integer.valueOf(this.c)) && abtpVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ackd
    public final String f() {
        return gp("asset_id");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String gp(String str) {
        return this.a.b(str, this.b, this.c);
    }

    public final byte[] gq() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c(GroupManagementRequest.DATA_TAG, i);
        return dataHolder.d[i2].getBlob(i, dataHolder.c.getInt(GroupManagementRequest.DATA_TAG));
    }

    public final int gr() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c("event_type", i);
        return dataHolder.d[i2].getInt(i, dataHolder.c.getInt("event_type"));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
