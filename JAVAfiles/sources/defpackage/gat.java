package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gat extends gdk {
    public final fzz a;
    private final arpi b;
    private int c;

    public gat(arpi arpiVar, fzz fzzVar) {
        fzzVar.getClass();
        this.b = arpiVar;
        this.a = fzzVar;
        this.c = Integer.MIN_VALUE;
        fzzVar.b.f(new gas(this, 1));
        f(new rd(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00e4  */
    @Override // defpackage.gdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gdl r8) {
        /*
            r7 = this;
            fzz r0 = r7.a
            int r0 = r0.a
            int r0 = r0 + (-1)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Leb
            java.lang.Integer r0 = r8.b
            if (r0 == 0) goto Leb
            java.util.List r1 = r8.a
            int r0 = r0.intValue()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L1d
        L1a:
            r8 = r2
            goto Le2
        L1d:
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r1.next()
            gdj r3 = (defpackage.gdj) r3
            java.util.List r3 = r3.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L21
            int r1 = r8.c
            int r0 = r0 - r1
            r1 = 0
        L39:
            java.util.List r3 = r8.a
            int r3 = defpackage.aqjn.z(r3)
            if (r1 >= r3) goto L63
            java.util.List r3 = r8.a
            java.lang.Object r3 = r3.get(r1)
            gdj r3 = (defpackage.gdj) r3
            java.util.List r3 = r3.b
            int r3 = defpackage.aqjn.z(r3)
            if (r0 <= r3) goto L63
            java.util.List r3 = r8.a
            java.lang.Object r3 = r3.get(r1)
            gdj r3 = (defpackage.gdj) r3
            java.util.List r3 = r3.b
            int r3 = r3.size()
            int r0 = r0 - r3
            int r1 = r1 + 1
            goto L39
        L63:
            java.util.List r3 = r8.a
            java.util.Iterator r3 = r3.iterator()
        L69:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lda
            java.lang.Object r4 = r3.next()
            gdj r4 = (defpackage.gdj) r4
            java.util.List r5 = r4.b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L69
            java.util.List r3 = r8.a
            int r5 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r5)
        L87:
            boolean r5 = r3.hasPrevious()
            if (r5 == 0) goto Ld2
            java.lang.Object r5 = r3.previous()
            gdj r5 = (defpackage.gdj) r5
            java.util.List r6 = r5.b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L87
            if (r0 >= 0) goto La4
            java.util.List r8 = r4.b
            java.lang.Object r8 = defpackage.aqjn.X(r8)
            goto Le2
        La4:
            java.util.List r3 = r8.a
            int r3 = defpackage.aqjn.z(r3)
            if (r1 != r3) goto Lc3
            java.util.List r3 = r8.a
            java.lang.Object r3 = defpackage.aqjn.ac(r3)
            gdj r3 = (defpackage.gdj) r3
            java.util.List r3 = r3.b
            int r3 = defpackage.aqjn.z(r3)
            if (r0 <= r3) goto Lc3
            java.util.List r8 = r5.b
            java.lang.Object r8 = defpackage.aqjn.ac(r8)
            goto Le2
        Lc3:
            java.util.List r8 = r8.a
            java.lang.Object r8 = r8.get(r1)
            gdj r8 = (defpackage.gdj) r8
            java.util.List r8 = r8.b
            java.lang.Object r8 = r8.get(r0)
            goto Le2
        Ld2:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "List contains no element matching the predicate."
            r8.<init>(r0)
            throw r8
        Lda:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)
            throw r8
        Le2:
            if (r8 == 0) goto Leb
            fzz r0 = r7.a
            java.lang.Object r8 = r0.a(r8)
            return r8
        Leb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gat.a(gdl):java.lang.Object");
    }

    @Override // defpackage.gdk
    public final Object b(gdg gdgVar, arpe arpeVar) {
        gbb gbbVar;
        int i;
        boolean z = gdgVar instanceof gdf;
        if (z) {
            gbbVar = gbb.REFRESH;
        } else if (gdgVar instanceof gdd) {
            gbbVar = gbb.APPEND;
        } else if (gdgVar instanceof gde) {
            gbbVar = gbb.PREPEND;
        } else {
            throw new armm();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i3 = gdgVar.b;
                if (i3 % 3 == 0) {
                    i = i3 / 3;
                    i2 = i;
                    this.c = i2;
                }
            }
            i = gdgVar.b;
            i2 = i;
            this.c = i2;
        }
        return arro.q(this.b, new gvr(this, new hkr(gbbVar, gdgVar.a(), gdgVar.b, i2), gdgVar, (arpe) null, 1), arpeVar);
    }

    public final void c(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE && i != i2) {
            throw new IllegalStateException("Page size is already set to " + this.c + '.');
        }
        this.c = i;
    }

    @Override // defpackage.gdk
    public final boolean d() {
        return false;
    }
}
