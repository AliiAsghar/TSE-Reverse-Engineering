package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class udn implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ udn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.alhr
    public final Object get() {
        int i = 4;
        boolean z = false;
        switch (this.b) {
            case 0:
                return Integer.valueOf(((udo) this.a).a.getPosition());
            case 1:
                return Boolean.valueOf(((udo) this.a).a.isAfterLast());
            case 2:
                return Boolean.valueOf(((udo) this.a).a.moveToFirst());
            case 3:
                return Integer.valueOf(((udo) this.a).a.getCount());
            case 4:
                return Boolean.valueOf(((udo) this.a).a.isBeforeFirst());
            case 5:
                return ((uhi) this.a).m490xc622cafb();
            case 6:
                tbt tbtVar = new tbt();
                tbtVar.r(tqq.NONE);
                return Boolean.valueOf(tbtVar.b(((ujh) this.a).e));
            case 7:
                tbt tbtVar2 = new tbt();
                tbtVar2.r(tqq.PERMANENT_ERROR);
                return Boolean.valueOf(tbtVar2.b(((ujh) this.a).e));
            case 8:
                Object obj = this.a;
                upy a = uqb.a();
                agpw agpwVar = (agpw) obj;
                a.k(agpwVar);
                a.w("work_queue-deleteAndReturnDeletedRows-query");
                alog t = a.b().t();
                upw upwVar = new upw();
                upwVar.a = agpwVar;
                upwVar.f("work_queue-deleteAndReturnDeletedRows-delete");
                upwVar.a().V();
                return t;
            case 9:
                return "_id:".concat(String.valueOf(((upv) this.a).getString(0)));
            case 10:
                return "minimum_start_time:".concat(String.valueOf(((upv) this.a).getString(9)));
            case 11:
                return "cancellation_tag:".concat(String.valueOf(((upv) this.a).getString(10)));
            case 12:
                return "type:".concat(String.valueOf(((upv) this.a).getString(1)));
            case 13:
                return "rawdata:".concat(String.valueOf(((upv) this.a).getString(2)));
            case 14:
                return "attempts:".concat(String.valueOf(((upv) this.a).getString(3)));
            case 15:
                return "timestamp:".concat(String.valueOf(((upv) this.a).getString(4)));
            case 16:
                return "queue:".concat(String.valueOf(((upv) this.a).getString(5)));
            case 17:
                return "deduplication_tag:".concat(String.valueOf(((upv) this.a).getString(6)));
            case 18:
                return "scheduled_in_workmanager:".concat(String.valueOf(((upv) this.a).getString(7)));
            case 19:
                return "workmanager_id:".concat(String.valueOf(((upv) this.a).getString(8)));
            default:
                upw upwVar2 = new upw();
                upwVar2.f("sequencedScheduleOrDeleteRow delete");
                upwVar2.b(new uol(this.a, i));
                if (upwVar2.d() <= 1) {
                    z = true;
                }
                albo.T(z);
                return gtd.a;
        }
    }
}
