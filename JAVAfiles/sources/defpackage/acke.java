package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acke extends abtq implements abrm {
    public final Status b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acke(DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        this.c = i;
        this.b = new Status(dataHolder.e);
    }

    @Override // defpackage.abrm
    public final Status a() {
        if (this.c != 0) {
            return this.b;
        }
        return this.b;
    }

    @Override // defpackage.abtq
    protected final /* synthetic */ Object f(int i, int i2) {
        if (this.c != 0) {
            return new aclg(this.a, i, i2);
        }
        return new aclj(this.a, i, i2);
    }

    @Override // defpackage.abtq
    protected final String g() {
        return "path";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acke(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.c = i;
        this.b = new Status(dataHolder.e);
    }
}
