package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alab extends albo implements akxo {
    public final List a;
    private Optional b;
    private Optional c;
    private List d;

    public alab(byte[] bArr) {
        super(null);
        this.a = new ArrayList();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    @Override // defpackage.akxo
    public final /* bridge */ /* synthetic */ Object a() {
        List unmodifiableList = DesugarCollections.unmodifiableList(this.a);
        if (unmodifiableList != null) {
            this.d = unmodifiableList;
            if (unmodifiableList != null) {
                return new alac(this.b, this.c, unmodifiableList);
            }
            throw new IllegalStateException("Missing required properties: listItems");
        }
        throw new NullPointerException("Null listItems");
    }

    public alab() {
        super(null);
        this.a = new ArrayList();
    }
}
