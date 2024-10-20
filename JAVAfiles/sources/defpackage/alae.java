package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alae extends albo implements akxo {
    public final List a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    private Optional f;
    private Optional g;
    private List h;

    public alae(byte[] bArr) {
        super(null);
        this.a = new ArrayList();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    @Override // defpackage.akxo
    public final /* synthetic */ Object a() {
        List list = this.a;
        this.h = list;
        if (list != null) {
            return new alaf(this.f, this.g, this.b, list, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: orderedItems");
    }

    public alae() {
        super(null);
        this.a = new ArrayList();
    }
}
