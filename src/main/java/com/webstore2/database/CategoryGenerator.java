package com.webstore2.database;

import com.webstore2.domain.Category;
import com.webstore2.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryGenerator {

    private Logger log = LoggerFactory.getLogger(CategoryRepository.class);

    @Autowired
    private CategoryRepository categoryRepository;

    private List<Category> categories = new ArrayList<>();

    public List<Category> generateCategories() {

        if (categoryRepository.findAll().size() == 0) {
            log.info("Generating categories...");
            //First level
            int order = 0;
            Category laptopsAndComputers = generateCategory("Laptops and Computers", order++);
            laptopsAndComputers.setTop(true);
            categories.add(laptopsAndComputers);

            Category smartphonesTVsAndElectronics = generateCategory("Smartphones, TVs and electronics", order++);
            smartphonesTVsAndElectronics.setTop(true);
            categories.add(smartphonesTVsAndElectronics);

            Category householdAppliances = generateCategory("Household appliances", order++);
            householdAppliances.setTop(true);
            categories.add(householdAppliances);

            Category goodsForHome = generateCategory("Goods for home", order++);
            goodsForHome.setTop(true);
            categories.add(goodsForHome);

            Category instrumentsAndAutoProducts = generateCategory("Instruments and auto products", order++);
            instrumentsAndAutoProducts.setTop(true);
            categories.add(instrumentsAndAutoProducts);

            Category plumbingAndRepair = generateCategory("Plumbing and repair", order++);
            plumbingAndRepair.setTop(true);
            categories.add(plumbingAndRepair);

            Category cottageGardenAndBackyard = generateCategory("Cottage, garden and backyard", order++);
            cottageGardenAndBackyard.setTop(true);
            categories.add(cottageGardenAndBackyard);

            Category sportsAndHobbies = generateCategory("Sports and hobbies", order++);
            sportsAndHobbies.setTop(true);
            categories.add(sportsAndHobbies);

            Category clothingFootwearAndOrnaments = generateCategory("Clothing, footwear and ornaments", order++);
            clothingFootwearAndOrnaments.setTop(true);
            categories.add(clothingFootwearAndOrnaments);

            Category beautyAndHealth = generateCategory("Beauty and health", order++);
            beautyAndHealth.setTop(true);
            categories.add(beautyAndHealth);

            Category childrensGoods = generateCategory("Children's goods", order++);
            childrensGoods.setTop(true);
            categories.add(childrensGoods);

            Category stationeryAndBooks = generateCategory("Stationery and books", order++);
            stationeryAndBooks.setTop(true);
            categories.add(stationeryAndBooks);

            Category alcoholicBeveragesAndProducts = generateCategory("Alcoholic Beverages and Products", order++);
            alcoholicBeveragesAndProducts.setTop(true);
            categories.add(alcoholicBeveragesAndProducts);

            Category goodsForBusiness = generateCategory("Goods for business", order++);
            goodsForBusiness.setTop(true);
            categories.add(goodsForBusiness);

            Category services = generateCategory("Services", order++);
            services.setTop(true);
            categories.add(services);

            order = 0;

            //Second level
            Category laptops = generateCategory("Laptops", order++, laptopsAndComputers);
            Category computers = generateCategory("Computers", order++, laptopsAndComputers);
            Category tablets = generateCategory("Tablets", order++, laptopsAndComputers);
            Category software = generateCategory("Software", order++, laptopsAndComputers);
            Category EBooks = generateCategory("E-books", order++, laptopsAndComputers);

            order = 0;

            Category phones = generateCategory("Phones", order++, smartphonesTVsAndElectronics);
            Category televisionsAndAccessories = generateCategory("Televisions and accessories", order++, smartphonesTVsAndElectronics);
            Category autoElectronics = generateCategory("Auto Electronics", order++, smartphonesTVsAndElectronics);
            Category portableElectronics = generateCategory("Portable Electronics", order++, smartphonesTVsAndElectronics);
            Category audioAndHomeCinema = generateCategory("Audio and home cinema", order++, smartphonesTVsAndElectronics);
            Category photosAndVideos = generateCategory("Photos and videos", order++, smartphonesTVsAndElectronics);

            order = 0;

            Category refrigeratorsAndFreezers = generateCategory("Refrigerators and freezers", order++, householdAppliances);
            Category washingMachinesAndDryers = generateCategory("Washing machines and dryers", order++, householdAppliances);
            Category stoves = generateCategory("Stoves", order++, householdAppliances);
            Category dishwashers = generateCategory("Dishwashers", order++, householdAppliances);

            order = 0;

            Category bathsBoxesShowers = generateCategory("Baths, boxes, showers", order++, plumbingAndRepair);
            Category sinksMixersSiphons = generateCategory("Sinks, mixers, siphons", order++, plumbingAndRepair);
            Category ceramics = generateCategory("Ceramics", order++, plumbingAndRepair);
            Category lighting = generateCategory("Lighting", order++, plumbingAndRepair);
            Category towelDriesAndRadiators = generateCategory("Towel Dries and Radiators", order++, plumbingAndRepair);
            Category engineeringPlumbing = generateCategory("Engineering plumbing", order++, plumbingAndRepair);

            order = 0;

            Category mensClothes = generateCategory("Men's clothes", order++, clothingFootwearAndOrnaments);
            Category womensClothes = generateCategory("Women's clothes", order++, clothingFootwearAndOrnaments);
            Category childrenClothing = generateCategory("Children's clothing", order++, clothingFootwearAndOrnaments);

            order = 0;

            Category toys = generateCategory("Toys", order++, childrensGoods);
            Category childrenRoom = generateCategory("Children room", order++, childrensGoods);
            Category developmentAndCreativity = generateCategory("Development and creativity", order++, childrensGoods);
            Category forKids = generateCategory("For kids", order++, childrensGoods);
            Category babyFood = generateCategory("Baby food", order++, childrensGoods);

            order = 0;

            Category paymentsAndTransfers = generateCategory("Payments and transfers", order++, services);
            Category traveling = generateCategory("Traveling", order++, services);

            order = 0;

            //Third level
            generateCategory("For simple tasks", order++, laptops);
            generateCategory("Universal", order++, laptops);
            generateCategory("Thin and light", order++, laptops);

            order = 0;

            generateCategory("Initial level", order++, computers);
            generateCategory("To work and study", order++, computers);
            generateCategory("Gaming computers", order++, computers);

            order = 0;

            generateCategory("Antivirus", order++, software);
            generateCategory("Games", order++, software);
            generateCategory("Operating Systems", order++, software);

            order = 0;

            generateCategory("Two SIM cards", order++, phones);
            generateCategory("With a large battery capacity", order++, phones);
            generateCategory("Protected", order++, phones);

            order = 0;

            generateCategory("GPS navigators", order++, autoElectronics);
            generateCategory("Radar Detectors", order++, autoElectronics);
            generateCategory("Video recorders", order++, autoElectronics);

            order = 0;

            generateCategory("Cameras", order++, photosAndVideos);
            generateCategory("Video cameras", order++, photosAndVideos);
            generateCategory("Lenses", order++, photosAndVideos);

            order = 0;

            generateCategory("Refrigerators", order++, refrigeratorsAndFreezers);
            generateCategory("Freezers", order++, refrigeratorsAndFreezers);

            order = 0;

            generateCategory("Gas stoves", order++, stoves);
            generateCategory("Electric stoves", order++, stoves);
            generateCategory("Combined stoves", order++, stoves);

            order = 0;

            generateCategory("Hydromassage boxes", order++, bathsBoxesShowers);
            generateCategory("Shower cubicles and walls", order++, bathsBoxesShowers);
            generateCategory("Shower trays", order++, bathsBoxesShowers);

            order = 0;

            generateCategory("Bulbs and accessories", order++, lighting);
            generateCategory("Chandeliers", order++, lighting);
            generateCategory("Floor lamps", order++, lighting);

            order = 0;

            generateCategory("Outerwear", order++, mensClothes);
            generateCategory("Sportswear", order++, mensClothes);
            generateCategory("Jeans, pants", order++, mensClothes);

            order = 0;

            generateCategory("Interactive toys", order++, toys);
            generateCategory("Radio-controlled toys", order++, toys);
            generateCategory("Soft toys, figurines, dolls", order++, toys);

            order = 0;

            generateCategory("Carriages and car seats", order++, forKids);
            generateCategory("Nutrition and feeding", order++, forKids);
            generateCategory("Nappy and swaddling", order++, forKids);

            order = 0;

            generateCategory("Tours", order++, traveling);
            generateCategory("Airline tickets", order++, traveling);
            generateCategory("Hotels", order++, traveling);

            write(categories, null);
            log.info("Generating categories ended successfully...");
        } else {
            log.info("Categories table is not empty, skip generation.");
        }
        return categories;
    }

    private Category generateCategory(String name, Integer order, Category parent) {
        Category category = generateCategory(name, order);
        parent.getChildCategories().add(category);
        return category;
    }

    private Category generateCategory(String name, Integer order) {
        Category category = Category.builder()
                .name(name)
                .order(order)
                .top(false)
                .enabled(true)
                .childCategories(new ArrayList<>()).build();
        return category;
    }

    private void write(List<Category> categories, Category parent) {
        List<Category> childCategories = new ArrayList<>();
        for (Category category : categories) {
            if (category.getChildCategories().size() != 0) {
                write(category.getChildCategories(), category);
            }
                childCategories.add(categoryRepository.save(category));
        }
        if (parent != null) {
            copyIds(parent.getChildCategories(), childCategories);
        }
    }

    private void copyIds(List<Category> target, List<Category> source) {
        for (int i = 0; i < source.size(); i++) {
            target.get(i).setId(source.get(i).getId());
        }
    }
}
