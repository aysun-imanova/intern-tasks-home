import service.ReservationService;

/**
 * 2. İstifadəçidən ilk öncə ay adını sonra isə ayın gününü daxil etməsini
 * istəyin (Misal: ay -> yanvar, gün -> 30). Əgər daxil edilən ay mövcud deyilsə, yenidən
 * daxil etməsini istəyin. Daxil edilən gün ayın günlərinin sayına uyğun deyilsə (Misal: fevral max
 * 29 gün ola bilər, 31 daxil edilibsə, yanlışdır.) günü yenidən daxil etməsini istəyin. Bütün şərtlər
 * ödənildiyi halda ekrana daxil edilən ad və günü çıxarıb "uğurla rezerv edildi" yazısı çıxsın!
 * (Misal: input -> yanvar, 24; output -> yanvar 24 tarixi üçün uğurlar rezerv edildi)
 *
 */
public class Main {
    public static void main(String[] args){
        ReservationService.makeReservation();
    }
}
