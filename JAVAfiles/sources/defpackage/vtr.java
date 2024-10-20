package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtr extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    static final alhr b = uuh.x(195615977, "enable_rcs_group_identifiers_telephony_batch_migration");
    public final anen c;
    public final vtq d;
    public final andr e = new andr();
    private final anen f;

    public vtr(anen anenVar, anen anenVar2, vtq vtqVar) {
        this.c = anenVar;
        this.f = anenVar2;
        this.d = vtqVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RcsGroupIdentifiersTelephonyMigrationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        if (!((Boolean) ((utz) b.get()).e()).booleanValue()) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 94, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).q("Returning failed no retry in RcsGroupIdentifiersTelephonyMigrationHandler because allowswitch is disabled.");
            return aktp.ag(upm.d());
        }
        int i = 10;
        return aktp.ai(new vcr(i), this.f).h(new vgd(this, 15), this.c).i(new vek(this, i), this.f);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vts.a.getParserForType();
    }
}
